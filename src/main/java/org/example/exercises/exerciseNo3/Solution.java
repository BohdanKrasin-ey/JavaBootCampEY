package org.example.exercises.exerciseNo3;

import org.example.exercises.exerciseNo3.annotations.Private;
import org.example.exercises.exerciseNo3.annotations.Public;
import org.example.exercises.exerciseNo3.annotations.ScanMe;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Solution {
    private final static List<MyInterface> myObjectsToScan = new ArrayList<>();

    private final static MyClass1 obj1 = new MyClass1();
    private final static MyClass2 obj2 = new MyClass2();
    private final static MyClass3 obj3 = new MyClass3();
    private final static MyClass4 obj4 = new MyClass4();


    public static void main(String[] args) {
        myObjectsToScan.addAll(List.of(obj1, obj2, obj3, obj4));

        printScanMeClasses();
        printMethodsScanMeAndPublic();
        printMethodsWithoutAnnotations();
        printAllClassesWithMethods();
    }


    private static void printScanMeClasses() {
        System.out.println("\n" + "Here list of classes with annotation @ScanMe :");
        for (MyInterface obj : myObjectsToScan) {
            Class<?> cls = obj.getClass();
            if (cls.isAnnotationPresent(ScanMe.class)) {
                System.out.println(cls.getSimpleName());
            }
        }
    }


    private static void printMethodsScanMeAndPublic() {
        System.out.println("\n" + "Here list of methods with annotation @Private in Classes with annotation @ScanMe :" + "\n");
        for (MyInterface obj : myObjectsToScan) {
            Class<?> cls = obj.getClass();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (cls.isAnnotationPresent(ScanMe.class)
                        && method.isAnnotationPresent(Private.class)) {
                    System.out.println(method.getName() + " from class " + cls.getSimpleName());
                }
            }
        }
    }

    private static void printMethodsWithoutAnnotations() {
        System.out.println("\n" + "Here list of methods without custom annotations in Classes without annotation @ScanMe :" + "\n");
        for (MyInterface obj : myObjectsToScan) {
            Class<?> cls = obj.getClass();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getAnnotations().length == 0 && !cls.isAnnotationPresent(ScanMe.class)) {
                    System.out.println("Method name: " + method.getName()+ " from class: "+ cls.getSimpleName());
                }
            }
        }
    }

    private static void printAllClassesWithMethods() {
        System.out.println("\n" + "Here list of all classes with methods:" + "\n");
        for (MyInterface obj : myObjectsToScan) {
            Class<?> cls = obj.getClass();
            Method[] methods = cls.getDeclaredMethods();
            Annotation[] annotations = cls.getAnnotations();
            System.out.print(cls.getSimpleName());
            for (Annotation annotation : annotations) {
                System.out.print(" with @" + annotation.annotationType().getSimpleName());
            }
            System.out.println(" with methods: ");
            for (Method method : methods) {
                Annotation[] annotations2 = method.getAnnotations();
                System.out.print(method.getName());
                for (Annotation annotation : annotations2) {
                    System.out.print(" with @" + annotation.annotationType().getSimpleName());
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
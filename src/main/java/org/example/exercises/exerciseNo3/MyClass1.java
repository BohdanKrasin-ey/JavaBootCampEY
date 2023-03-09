package org.example.exercises.exerciseNo3;

import org.example.exercises.exerciseNo3.annotations.Private;
import org.example.exercises.exerciseNo3.annotations.Public;
import org.example.exercises.exerciseNo3.annotations.ScanMe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@ScanMe
public class MyClass1  implements MyInterface{
    @Override
    @Private
    public String getId() {
        return null;
    }

    @Override
    @Public
    public Integer sum(Integer a, Integer b) {
        return null;
    }

    @Override
    @Private
    @Public
    public Double divide(Double a, Double B) throws Exception {
        return null;
    }

    @Override
    @Private
    public Date calcDate3DaysAgo() {
        return null;
    }

    @Override
    @Public
    public LocalTime avaysAdd3Hours(LocalDate inDate) {
        return null;
    }

    @Override
    @Private
    public void someMethodWithoutReturnData() {

    }

    @Override
    @Public
    public void someMethodWithoutDataButHaveVariableNumbersOfArguments(String... varArgs) {

    }
}

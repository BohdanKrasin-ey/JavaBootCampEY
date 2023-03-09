package org.example.exercises.exerciseNo3;

import org.example.exercises.exerciseNo3.annotations.Private;
import org.example.exercises.exerciseNo3.annotations.Public;
import org.example.exercises.exerciseNo3.annotations.ScanMe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;



public class MyClass4 implements MyInterface{
    @Override
    public String getId() {
        return null;
    }

    @Override
    public Integer sum(Integer a, Integer b) {
        return null;
    }

    @Override
    @Public
    @Private
    public Double divide(Double a, Double B) throws Exception {
        return null;
    }

    @Override
    @Public
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
    public void someMethodWithoutReturnData() {

    }

    @Override
    @Public
    public void someMethodWithoutDataButHaveVariableNumbersOfArguments(String... varArgs) {

    }
}

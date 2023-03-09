package org.example.exercises.exerciseNo3;

import org.example.exercises.exerciseNo3.annotations.Private;
import org.example.exercises.exerciseNo3.annotations.Public;
import org.example.exercises.exerciseNo3.annotations.ScanMe;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


@ScanMe
public class MyClass3  implements MyInterface{
    @Override
    @Private
    @Public
    public String getId() {
        return null;
    }

    @Override
    public Integer sum(Integer a, Integer b) {
        return null;
    }

    @Override
    @Public
    public Double divide(Double a, Double B) throws Exception {
        return null;
    }

    @Override
    @Public
    public Date calcDate3DaysAgo() {
        return null;
    }

    @Override
    @Private
    public LocalTime avaysAdd3Hours(LocalDate inDate) {
        return null;
    }

    @Override
    public void someMethodWithoutReturnData() {

    }

    @Override
    public void someMethodWithoutDataButHaveVariableNumbersOfArguments(String... varArgs) {

    }
}

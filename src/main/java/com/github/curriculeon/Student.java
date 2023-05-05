package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private final List<Double> testScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        setFirstName(firstName);
        setLastName(lastName);
        this.testScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public Student() {
        testScores = new ArrayList<>(Collections.emptyList());

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
    }

    public String getLastName() {
        return null;
    }

    public void setLastName(String lastName) {
    }

    public Double[] getExamScores() {
        return null;
    }

    public void addExamScore(double examScore) {
    }


    public void setExamScore(int examNum, double updateScore) {
    }


    public Double getAverageExamScore() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     * @param studentToCompareAgainst the object to be compared; compare by grade, then by name
     * @return
     */
    @Override
    public int compareTo(Student studentToCompareAgainst) {
        return Integer.valueOf(null);
    }
}


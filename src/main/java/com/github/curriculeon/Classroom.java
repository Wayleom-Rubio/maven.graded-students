package com.github.curriculeon;

import java.util.*;

import java.util.Map;

public class Classroom {

    private final List<Student> studentList;

    public Classroom(Student[] students) {
        this.studentList = new ArrayList<>(Arrays.asList(students));
    }

    public Classroom() {
        studentList = new ArrayList<>(Collections.emptyList());

    }

    public Student[] getStudents() {
        return studentList.toArray(new Student[0]);
    }


    public Double getAverageExamScore() {
        return null;
    }

    public Boolean addStudent(Student students) {
        return null;
    }

    public Boolean removeStudent(Student student) {
        return null;
    }

    public Student[] getStudentsByScore() {
        return null;
    }

    public Map<Student, Character> getGradeBook() {
        return null;
    }

}


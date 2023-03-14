package com.github.curriculeon.classroom;

import com.github.curriculeon.Classroom;
import com.github.curriculeon.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class GetGradeBookTest {
    private Classroom classroom;

    @Before
    public void setUp() {
        // Create a new classroom with some students
        Student alice = new Student("Alice", "Smith", new Double[] { 80.0, 90.0, 95.0 });
        Student bob = new Student("Bob", "Jones", new Double[] { 75.0, 85.0, 90.0 });
        Student charlie = new Student("Charlie", "Brown", new Double[] { 85.0, 95.0, 100.0 });
        classroom = new Classroom(new Student[]{alice, bob, charlie});
    }

    @Test
    public void testGetGradeBook() {
        // Get the grade book and make sure it's not null
        Map<Student, Double> gradeBook = classroom.getGradeBook();
        Assert.assertNotNull(gradeBook);

        // Check that the grade book contains the expected students and grades
        Assert.assertEquals(3, gradeBook.size());
        Assert.assertTrue(gradeBook.containsKey(new Student("Alice", "Smith", null)));
        Assert.assertEquals(88.33, gradeBook.get(new Student("Alice", "Smith", null)), 0.01);
        Assert.assertTrue(gradeBook.containsKey(new Student("Bob", "Jones", null)));
        Assert.assertEquals(83.33, gradeBook.get(new Student("Bob", "Jones", null)), 0.01);
        Assert.assertTrue(gradeBook.containsKey(new Student("Charlie", "Brown", null)));
        Assert.assertEquals(93.33, gradeBook.get(new Student("Charlie", "Brown", null)), 0.01);
    }
}

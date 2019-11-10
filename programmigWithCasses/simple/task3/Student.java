package com.epam.programmigWithCasses.simple.task3;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int groupNumber;
    private int[] marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getMarks(int index) {
        return marks[index];
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setMarks(int index, int element) {
        this.marks[index] = element;
    }

    public Student() {
    }

    public Student(String name, int groupNumber, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getGroupNumber() == student.getGroupNumber() &&
                Objects.equals(getName(), student.getName()) &&
                Arrays.equals(getMarks(), student.getMarks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getGroupNumber());
        result = 31 * result + Arrays.hashCode(getMarks());
        return result;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
package com.epam.programmigWithCasses.simple.task3;

public class StudentLogic {
    public static boolean isALevelStudent(Student student) {
        int minMark = 9;
        for (int mark : student.getMarks()) {
            if (mark < minMark) {
                minMark = mark;
            }
        }
        if (minMark >= 9) {
            return true;
        } else {
            return false;
        }
    }
}

package com.epam.programmigWithCasses.simple.task3;

import static com.epam.programmigWithCasses.simple.task3.StudentLogic.isALevelStudent;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        student[0] = new Student("Сидоров А.С.", 1, new int[]{5, 6, 4, 8, 9});
        student[1] = new Student("Иванов О.С.", 1, new int[]{6, 4, 8, 9, 10});
        student[2] = new Student("Никитин Д.С.", 1, new int[]{9, 9, 10, 10, 10});
        student[3] = new Student("Денисов В.С.", 2, new int[]{8, 6, 4, 8, 9});
        student[4] = new Student("Сидоренко Л.С.", 2, new int[]{9, 10, 10, 10, 9});
        student[5] = new Student("Белов А.А.", 2, new int[]{5, 6, 4, 8, 9});
        student[6] = new Student("Аверин И.С.", 2, new int[]{5, 6, 4, 8, 9});
        student[7] = new Student("Симкин Г.О.", 3, new int[]{5, 6, 4, 8, 9});
        student[8] = new Student("Грайлов В.В.", 3, new int[]{5, 6, 4, 8, 9});
        student[9] = new Student("Десяткин А.С.", 3, new int[]{10, 10, 10, 10, 9});

        for (Student studentCurrent : student) {

            if (isALevelStudent(studentCurrent)) {
                System.out.printf("ФИО: %s, № Группа: %d. %n", studentCurrent.getName(),studentCurrent.getGroupNumber());
            }

        }
    }
}

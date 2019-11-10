package com.epam.basics.line;

/*6. Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае:*/
public class Task6 {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        if ((-2 < x && x < 2 && 0 < y && y < 4) ||
                (-4 < x && x < 4 && -4 < y && y < 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

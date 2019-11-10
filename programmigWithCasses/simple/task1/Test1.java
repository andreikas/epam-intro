package com.epam.programmigWithCasses.simple.task1;

/* 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

public class Test1 {
    private int var1;
    private int var2;


    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public void printVariable() {

        System.out.println("Переменные: var1 =" + var1);
        System.out.println("var2 =" + var2);
    }

    public int summ() {
        return var1 + var2;
    }

    public int max() {
        if (var1 > var2) {
            return var1;
        } else {
            return var2;
        }
    }

}

package com.epam.programmigWithCasses.simple.task1;

public class Main extends  Test1{

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setVar1(1);
        test1.setVar2(2);
        test1.printVariable();
        System.out.println("Сумма элементов = " + test1.summ());
        System.out.println("Максимальный элемент = " + test1.max());

    }
}

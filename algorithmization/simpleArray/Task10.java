package com.epam.algorithmization.simpleArray;
/*10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/
    public class Task10 {
    public static void main(String[] args) {
        int s = 0;
        int[] a = new int[]{2, 3, 3, 6, 5, 6, 7, 8, 9, 10};


      for (int i = 0; i < a.length; i++) {
              if ((i + 1) % 2 == 0) {
                a[i] = 0;
            }
        }
        System.out.println("Новые елементы массива");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}



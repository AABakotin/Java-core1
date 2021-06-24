package lesson3;

import java.util.Arrays;

public class lesson3 {



    public static void main(String[] args) {
        //Первое задание
        int[] reversMassive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeNumbsInMassive(reversMassive);

        //Второе задание
        int[] stoMassive = new int[100];
        pastNumbsInMassive(stoMassive);

        //Третье задание
        int[] multiplicationNumsInMassive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationMassive(multiplicationNumsInMassive);

        //Четвертое задание
        int[][] quadroArr = new int[6][6];
        diagonal(quadroArr);


        //Пятое задание
        int len = 5;
        int initialValue = 10;
        System.out.println(Arrays.toString(returnMassive(len, initialValue)));


        //Шестое задание
        System.out.println(Arrays.toString(multiplicationNumsInMassive));
        maxminMassive(multiplicationNumsInMassive);


    }

    private static void changeNumbsInMassive(int[] reversMassive) {
        System.out.println(Arrays.toString(reversMassive) + "  Первоначальный заданный массив");
        for (int i = 0; i < reversMassive.length; i++) {
            if (reversMassive[i] == 1) {
                reversMassive[i] = 0;
            } else {
                reversMassive[i] = 1;
            }
        }
        System.out.println(Arrays.toString(reversMassive) + "  Измененный массив 0 -> 1 ; 1 -> 0");
    }

    private static void pastNumbsInMassive(int[] stoMassive) {
        for (int i = 0; i < stoMassive.length; i++) {
            stoMassive[i] = i;
        }
        System.out.println(Arrays.toString(stoMassive));
    }

    private static void multiplicationMassive(int[] multiplicationNumsInMassive) {
        System.out.println(Arrays.toString(multiplicationNumsInMassive) + " Не изменный массив");
        for (int i = 0; i < multiplicationNumsInMassive.length; i++) {
            if (multiplicationNumsInMassive[i] < 6) {
                multiplicationNumsInMassive[i] = multiplicationNumsInMassive[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multiplicationNumsInMassive) + " Число массива < 6 умножен на 2");
    }

    private static void diagonal(int[][] quadroArr) {
        for (int y = 0; y < quadroArr.length; y++) {
            for (int x = 0; x < quadroArr.length; x++) {
                if (y == x) quadroArr[y][x] = 1;
                if (quadroArr[x][y] == 0) quadroArr[y][quadroArr.length - y - 1] = 2;
            }System.out.println(Arrays.toString(quadroArr[y]));

            }

        }


    private static int[] returnMassive(int len, int initialValue) {
        int[] megaMassive = new int[len];
        Arrays.fill(megaMassive, initialValue);
        return megaMassive;
    }

    private static void maxminMassive(int...massive) {

        int max = massive[0];
        int min = massive[0];
        for (int i : massive) {
            if (i > massive[0])
                if (max < i) max = i;
             if (min > i) min = i;
        }System.out.printf("Максимальное значение %d\nМинимальное значение %d" , max,min );




    }

}









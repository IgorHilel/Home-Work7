package com.igorberezovchuck;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int[] randomNums = new int[scan.nextInt()];
        Random rand = new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = rand.nextInt(100);
        }

        System.out.println("Первый массив: " + Arrays.toString(randomNums));
        int[] result = getAverage(randomNums);
        System.out.println("Второй массив: " + Arrays.toString(result));
    }

    private static int[] getAverage(int[] randomNums) {
        int sum = 0;
        for (int i = 0; i < randomNums.length; i++) {
            sum = sum + randomNums[i];
        }
        int average = sum / randomNums.length;
        System.out.println("Среднее арифметическое: " + average);
        int count = 0;
        for (int i = 0; i < randomNums.length; i++) {
            if (randomNums[i] > average) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < randomNums.length; i++) {
            if (randomNums[i] > average) {
                result[index] = randomNums[i];
                index++;
            }
        }
        return result;
    }


}

package com.igorberezovchuck;

public class Task1 {

    public static void main(String[] args) {

        int hours = 24;
        int minutes = 60;
        int count = 0;

        for (int i = 0; i < hours; i++) {
            for (int j = 0; j < minutes; j++) {
                if (i / 10 % 10 == j % 10 && j / 10 % 10 == i % 10) {
                    count++;
                }
            }
        }
        System.out.println("Количество палиндромов времени: " + count);

    }

}

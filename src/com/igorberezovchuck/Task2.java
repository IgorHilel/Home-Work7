package com.igorberezovchuck;

public class Task2 {

    public static void main(String[] args) {

        int tickets = 999999;
        int count = 0;

        for (int i = 1; i <= tickets; i++) {
            if (i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10) {
                count++;
            }
        }
        System.out.println("Количество счастливых билетиков: " + count);
    }
}

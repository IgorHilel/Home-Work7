package com.igorberezovchuck;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random rand = new Random();
        double money = rand.nextInt(999999) + 1;
        System.out.println("Сумма депозита: " + money);
        int years = rand.nextInt(5) + 1;
        System.out.println("Срок депозита: " + years);
        int months = 12;
        double percent = 0.015;

        for (int i = 1; i <= years; i++) {
            for (int j = 0; j < months; j++) {
                money = money + money * percent;
            }
            System.out.printf("Сумма депозита после %s-го года: %s.\n", i, money);
        }
        System.out.printf("Сумма вклада станет: %.2f у. е.", money);

    }
}
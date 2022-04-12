package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Можна порівнювати будь-яку кількість цифр


        System.out.println("Скільки цифр потрібно порівняти?");
        int numbersLength;
        if (sc.hasNextInt()) {
            numbersLength = sc.nextInt();
            if (numbersLength <= 0) {
                return;
            }
        }else {
            System.out.println("Введені дані невірні");
            return;
        }
        double[] numbers = new double[numbersLength];


        System.out.println("Введіть дріб використовуючи кому ','\n");
        for (int count = 0; count < numbersLength; count++) {
            System.out.println("Введіть число №" + (count + 1) + ":");
            if (sc.hasNextDouble()) {
                numbers[count] = sc.nextDouble();
            }else {
                System.out.println("Введені дані невірні");
                return;
            }
        }


        double largestNumber = 0;
        for (int pos = 0; pos < numbersLength; pos++) {
            if (numbersLength == 1) {
                System.out.println(numbers[pos] + " найбільше з введених вами чисел!");
                return;
            }
            int j = pos + 1;
            if (j == numbersLength) {
                j = 0;
            }
            if (numbers[pos] > numbers[j]) {
                largestNumber = numbers[pos];
            }
        }
        System.out.println(largestNumber + " найбільше з введених вами чисел!");
    }
}
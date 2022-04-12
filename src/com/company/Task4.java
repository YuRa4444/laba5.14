package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String secondName;


        System.out.println("Введіть ім'я 1");
        if (sc.hasNextLine()) {
            firstName = sc.nextLine();
        } else {
            System.out.println("Error 404!");
            return;
        }


        System.out.println("Введіть ім'я 2");
        if (sc.hasNextLine()) {
            secondName = sc.nextLine();
        } else {
            System.out.println("Error 404!");
            return;
        }


        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Доступ дозволено!");
        }else {
            System.out.println("У доступі відмовлено!");
        }
    }
}
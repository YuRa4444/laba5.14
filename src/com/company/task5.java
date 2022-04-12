package com.company;

import java.util.Scanner;

public class task5 {
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


        if (firstName.length() > secondName.length()) {
            System.out.printf("Слово '%s' більше ніж слово '%s'", firstName, secondName);
        }else if (firstName.length() < secondName.length()) {
            System.out.printf("Слово '%s' більше ніж слово '%s'", secondName, firstName);
        }else {
            System.out.printf("Слова '%s' і '%s' мають однакову довжину", firstName, secondName);
        }
    }
}
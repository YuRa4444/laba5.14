package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"перше", "друге", "третє", "четверте", "п'яте"};
        String sentence = "";
        for (int count = 0; count < 5; count++) {
            System.out.println("Введіть " + words[count] + " слово");
            if (sc.hasNextLine()) {
                String temp = sc.nextLine();
                sentence = sentence.concat(temp).concat(" ");
            }else {
                System.out.println("Щось пішло не так");
            }
        }
        System.out.println(sentence);
    }
}
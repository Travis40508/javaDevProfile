package com.company;

import com.company.About.About;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidAnswer = false;
        System.out.println("Hello! Please make a selection!");
        System.out.println("1.About \n" +
                "2.Android \n" +
                "3.Web \n" +
                "4.Contact");
        while (!isValidAnswer) {
            switch (scanner.next()) {
                case "1":
                    new About().init();
                    isValidAnswer = true;
                    break;
                default:
                    System.out.println("Invalid Answer! Please try again!");
                    isValidAnswer = false;
                    break;
            }
        }
    }
}

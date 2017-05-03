package com.company;

import com.company.About.About;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        offerSelection();
    }

    public static void offerSelection() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidAnswer = false;
        System.out.println("Hello! Please make a selection!");
        while (!isValidAnswer) {
        System.out.println("1.About \n" +
                "2.Android \n" +
                "3.Web \n" +
                "4.Contact\n");

            switch (scanner.next()) {
                case "1":
                    new About().init();
                    isValidAnswer = true;
                    break;
                default:
                    System.out.println("Invalid Answer! Please try again! \n");
                    isValidAnswer = false;
                    break;
            }
        }
    }
}

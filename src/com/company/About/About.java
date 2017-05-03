package com.company.About;

import com.company.About.Education.Education;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class About implements AboutView {

    private AboutPresenter presenter;
    private Scanner scanner;

    public About() {

    }

    public void init() {
        presenter = new AboutPresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
        presenter.classInstantiated();
    }

    @Override
    public void greetUser() {
        System.out.println("Welcome! Which would you like to know more about?");
        System.out.println("1.Education \n" +
                           "2.Experience \n" +
                           "3.Skills \n" +
                           "4.Facts");
        switch (scanner.next()) {
            case "1":
                presenter.educationSelected();
                break;
            default:
                presenter.invalidStatementSelected();
                break;
        }
    }

    @Override
    public void launchEducation() {
        new Education().init();
    }

    @Override
    public void startOver() {
        System.out.println("Invalid response! Please try again!");
        greetUser();
    }
}

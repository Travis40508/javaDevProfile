package com.company.About.Education;

import com.company.About.About;
import com.company.Main;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class Education implements EducationView{
    private EducationPresenter presenter;
    private Scanner scanner;

    public Education() {

    }

    public void init() {
        presenter = new EducationPresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
        presenter.classInstantiated();
    }

    @Override
    public void greetUser() {
        System.out.println("B.A. - Philosophy\n" +
                "Class of 2012\n");
        promptForNextMove();

    }

    @Override
    public void returnToAbout() {
        new About().init();
    }

    @Override
    public void returnToMain() {
        Main.offerSelection();
    }

    @Override
    public void quitApp() {
        System.out.println("Thank you for stopping by!");
        System.exit(0);
    }

    @Override
    public void startOver() {
        System.out.println("Invalid response! Please try again!\n");
        promptForNextMove();
    }

    private void promptForNextMove() {
        System.out.println("What would you like to do?\n" +
                "1.Return to About\n" +
                "2.Return to Main\n" +
                "3.Quit\n");
        switch(scanner.next()) {
            case "1" :
                presenter.aboutSelected();
                break;
            case "2" :
                presenter.mainSelected();
                break;
            case "3" :
                presenter.quitAppSelected();
                break;
            default:
                presenter.invalidResponse();
                break;
        }
    }
}

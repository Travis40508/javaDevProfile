package com.company.About.Experience;

import com.company.About.About;
import com.company.Main;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class Experience implements ExperienceView {

    private ExperiencePresenter presenter;
    private Scanner scanner;

    public Experience() {


    }

    public void init() {
        presenter = new ExperiencePresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
        presenter.classInstantiated();
    }

    @Override
    public void giveExperience() {
        System.out.println("Eleven Fifty Academy\n" +
                "-August 2016 - December 2016-\n" +
                "* Completed Eleven Fifty Academy Bootcamp\n" +
                "* Acquired Golden Badge for Web Proficiency\n" +
                "* Acquired Red Badge for Mobile Proficiency\n\n" +
                "Interapt\n" +
                "-January 2017 - April 2017-\n" +
                "* Completed Four Month Internship\n" +
                "* Acquired Android Skill-Set\n" +
                "* Worked on Multiple Production Applications\n\n");
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
    public void leaveApplication() {
        System.out.println("Thanks for stopping by!");
        System.exit(0);
    }

    @Override
    public void startOver() {
        System.out.println("Invalid response! Please try again!");
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

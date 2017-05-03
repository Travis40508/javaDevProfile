package com.company.About.Skills;

import com.company.About.About;
import com.company.Main;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class Skills implements SkillsView {

    private SkillsPresenter presenter;
    Scanner scanner;

    public Skills() {


    }

    public void init() {
        presenter = new SkillsPresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
        presenter.classInstantiated();
    }

    @Override
    public void giveSkills() {
        System.out.println("HTML/CSS\n" +
                "* Comfortable with HTML/CSS Language Within and Without Bootstrap Framework\n" +
                "* Able to use REST calls for Dynamic Page Structures\n" +
                "* Know JavaScript Language Fundamentals\n\n" +
                "Java/Android\n" +
                "* Comfortable with Java and Android Languages at Production Level\n" +
                "* Very comfortable with RxJava, Dagger2, MVP, and TDD\n" +
                "* Capable of Implementing REST calls for Dynamic Applications\n\n");
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
    public void quitApplication() {
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

package com.company.About.Facts;

import com.company.About.About;
import com.company.Main;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class Facts implements FactsView {

    private FactsPresenter presenter;
    private Scanner scanner;

    public Facts() {


    }

    public void init() {
        presenter = new FactsPresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
        presenter.classInstantiated();
    }

    @Override
    public void showFacts() {
        System.out.println("-Facts-\n" +
                "* Technophile\n" +
                "* Nature Lover\n" +
                "* Retro Gamer\n" +
                "* Activist\n" +
                "* Some-What Bilingual\n" +
                "* 151 WPM Typing Speed\n" +
                "* Record Collector\n");
        promptResponse();
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
    public void exitApplication() {
        System.out.println("Thanks for stopping by!");
        System.exit(0);
    }

    @Override
    public void startOver() {
        System.out.println("Invalid response! Please try again.");
        promptResponse();
    }

    private void promptResponse() {
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

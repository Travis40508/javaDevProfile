package com.company.About.Education;

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
        System.out.println("hi!");
    }
}

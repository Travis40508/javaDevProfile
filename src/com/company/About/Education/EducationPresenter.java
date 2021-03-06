package com.company.About.Education;

import com.company.Tools.BasePresenter;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class EducationPresenter extends BasePresenter<EducationView> {

    public void classInstantiated() {
        getView().greetUser();
    }

    public void aboutSelected() {
        getView().returnToAbout();
    }

    public void mainSelected() {
        getView().returnToMain();
    }

    public void quitAppSelected() {
        getView().quitApp();
    }

    public void invalidResponse() {
        getView().startOver();
    }
}

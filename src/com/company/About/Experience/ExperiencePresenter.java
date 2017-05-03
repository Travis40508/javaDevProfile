package com.company.About.Experience;

import com.company.Tools.BasePresenter;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class ExperiencePresenter extends BasePresenter<ExperienceView> {


    public void classInstantiated() {
        getView().giveExperience();
    }

    public void aboutSelected() {
        getView().returnToAbout();
    }

    public void mainSelected() {
        getView().returnToMain();
    }

    public void quitAppSelected() {
        getView().leaveApplication();
    }

    public void invalidResponse() {
        getView().startOver();
    }
}

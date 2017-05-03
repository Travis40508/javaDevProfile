package com.company.About.Skills;

import com.company.Tools.BasePresenter;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class SkillsPresenter extends BasePresenter<SkillsView> {


    public void classInstantiated() {
        getView().giveSkills();
    }

    public void aboutSelected() {
        getView().returnToAbout();
    }

    public void mainSelected() {
        getView().returnToMain();
    }

    public void quitAppSelected() {
        getView().quitApplication();
    }

    public void invalidResponse() {
        getView().startOver();
    }
}

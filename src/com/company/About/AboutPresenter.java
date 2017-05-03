package com.company.About;

import com.company.Tools.BasePresenter;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class AboutPresenter extends BasePresenter<AboutView> {

    public void classInstantiated() {
        getView().greetUser();
    }

    public void educationSelected() {
        getView().launchEducation();
    }

    public void invalidStatementSelected() {
        getView().startOver();
    }
}

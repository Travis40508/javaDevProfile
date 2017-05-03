package com.company.About.Facts;

import com.company.Tools.BasePresenter;

/**
 * Created by rodneytressler on 5/2/17.
 */
public class FactsPresenter extends BasePresenter<FactsView> {


    public void classInstantiated() {
        getView().showFacts();
    }

    public void aboutSelected() {
        getView().returnToAbout();
    }

    public void mainSelected() {
        getView().returnToMain();
    }

    public void quitAppSelected() {
        getView().exitApplication();
    }

    public void invalidResponse() {
        getView().startOver();
    }
}

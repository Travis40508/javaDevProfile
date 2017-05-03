package com.company.Tools;

/**
 * Created by rodneytressler on 5/2/17.
 */
public abstract class BasePresenter<T> {
    private T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }
}

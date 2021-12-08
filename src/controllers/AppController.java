package controllers;

import models.App;
import views.AppView;

public class AppController {

    App model;
    AppView view;

    public AppController(App model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInput();

        int chosenController = model.getControllerType();

        switch (chosenController)
        {
            case 1 -> model.runGuest();
            case 2 -> model.runReservation();
            default -> throw new IllegalStateException("Unexpected value: " + chosenController);
        }
    }
}

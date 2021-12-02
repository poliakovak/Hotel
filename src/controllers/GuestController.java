package controllers;

import models.Guest;
import utils.Rounder;
import views.GuestView;

import java.util.HashMap;

public class GuestController {

    Guest model;
    GuestView view;
    private static HashMap<Integer, String> hotelNames = new HashMap<>(5);

    public GuestController(Guest model, GuestView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        hotelNames.put(1, "Sunny Bay 1*");
        hotelNames.put(2, "Golden Sands 2*");
        hotelNames.put(3, "Blue Marine 3*");
        hotelNames.put(4, "Heaven Gardens 4*");
        hotelNames.put(5, "Seaside Resort & Spa 5*");

        view.getInputs();

        String name = model.getName();
        String stayTime = String.valueOf(model.getNightsNumber());
        String hotelName = hotelNames.get(model.getStarsNumber());
        double pricePerNight = model.calculatePrice(model.getStarsNumber());

        double totalPayment = model.calculatePayment(pricePerNight,
                model.getGuestsNumber(), model.getNightsNumber());

        String roundedPayment = Rounder.roundValue(totalPayment);

        String output = "------------------------------\n" +
                "Имя гостя: " + name + "\n" +
                "Название отеля: " +  hotelName + "\n" +
                "Стоимость за одну ночь (грн.): " +  pricePerNight + "\n" +
                "Период проживания: " + stayTime + " ночей\n" +
                "Стоимость проживания за весь период (грн.): " + roundedPayment;

        view.getOutput(output);

    }
}

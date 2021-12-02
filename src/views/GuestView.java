package views;

import models.Guest;
import utils.Validator;

import java.util.Scanner;

public class GuestView {

    Guest model;
    String title;
    String name;
    int nightsNumber;
    int guestsNumber;
    int starsNumber;
    Scanner scanner;

    public GuestView(Guest model) {this.model = model; }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите имя: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество ночей: ";
        System.out.print(title);
        nightsNumber = Validator.validateIntInput(scanner);
        model.setNightsNumber(nightsNumber);

        title = "Введите количество гостей: ";
        System.out.print(title);
        guestsNumber = Validator.validateIntInput(scanner);
        model.setGuestsNumber(guestsNumber);

        title = "Введите количество звезд: ";
        System.out.print(title);
        starsNumber = Validator.validateIntInput(scanner);
        model.setStarsNumber(starsNumber);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

}

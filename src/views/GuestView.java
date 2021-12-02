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
    int kidsNumber;
    int petsNumber;
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

        title = "Введите количество взрослых гостей: ";
        System.out.print(title);
        guestsNumber = Validator.validateIntInput(scanner);
        model.setGuestsNumber(guestsNumber);

        title = "Введите количество детей: ";
        System.out.print(title);
        kidsNumber = Validator.validateIntInput(scanner);
        model.setKidsNumber(kidsNumber);

        title = "Введите количество детей: ";
        System.out.print(title);
        petsNumber = Validator.validateIntInput(scanner);
        model.setPetsNumber(petsNumber);

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

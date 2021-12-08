package views;

import models.App;
import utils.Validator;

import java.util.Scanner;

public class AppView {

    App model;
    Scanner scanner;

    int controllerType;

    public AppView(App model) {this.model = model; }

    public void getInput() {
        scanner = new Scanner(System.in);
        System.out.print("Введите номер, чтобы совершать действия\n1 - Гость\n2 - Резервация:\n ");
        controllerType = Validator.validateTypeOfController(scanner);
        model.setControllerType(controllerType);

    }
}

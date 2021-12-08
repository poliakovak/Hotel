package views;

import exceptions.DateInputException;
import models.Reservation;
import utils.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationView {

    Reservation model;
    String title;
    int roomNumber;
    Date checkIn;
    Date checkOut;
    Scanner scanner;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String userAnswer;

    public ReservationView(Reservation model) {this.model = model; }

    public void getInputs() {

        scanner = new Scanner(System.in);

        getRoomNumber();
        getDates();

    }

    // исрользуется и для первоначального бронирования, и для обновления дат
    public void getDates() {

        try {

            title = "Введите дату заезда (dd/MM/yyyy): ";
            System.out.print(title);
            checkIn = sdf.parse(scanner.next());
            model.setCheckIn(checkIn);

            title = "Введите дату выезда (dd/MM/yyyy): ";
            System.out.print(title);
            checkOut = sdf.parse(scanner.next());
            model.setCheckOut(checkOut);

        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        } catch (DateInputException e) {
            System.out.println("Ошибка при бронировании");
        }


    }

    public void getRoomNumber() {

        title = "Введите номер комнаты: ";
        System.out.print(title);
        roomNumber = Validator.validateIntInput(scanner);
        model.setRoomNumber(roomNumber);

    }

    public void getOutput(String output) {
        System.out.println(output);
    }

    public void updateDates() {

        scanner = new Scanner(System.in);

        title = "Хотите ли Вы изменить даты?\nДа - нажмте \"y\"\nНет - нажмте \"n\": ";
        System.out.println(title);

        userAnswer = scanner.nextLine().trim();

        while (!userAnswer.equals("y") && !userAnswer.equals("n")) {
            System.out.print("Введено неверное значение. Попробуйте ещё раз: ");
            userAnswer = scanner.nextLine().trim();
        }

        switch (userAnswer) {
            case "y":
                title = "Введите новые даты:\n";
                System.out.print(title);
                getDates();
            case "n":
                title = "Даты не изменены.\n";
                System.out.print(title);
        }

        scanner.close();
    }
}

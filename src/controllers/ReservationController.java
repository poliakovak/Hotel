package controllers;

import models.Reservation;
import views.ReservationView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationController {

    Reservation model;
    ReservationView view;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservationController(Reservation model, ReservationView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String roomNumber = String.valueOf(model.getRoomNumber());
        Date checkIn = model.getCheckIn();
        Date checkOut = model.getCheckOut();
        long duration = model.calculateDuration();

        String output = "------------------------------\n" +
                "Номер комнаты: " +  roomNumber + "\n" +
                "Дата заезда: " +  sdf.format(checkIn) + "\n" +
                "Дата заезда: " +  sdf.format(checkOut) + "\n" +
                "Период проживания (ночей): " + duration + "\n";

        view.getOutput(output);

    }
}

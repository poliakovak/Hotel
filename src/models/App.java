package models;

import controllers.GuestController;
import controllers.ReservationController;
import views.GuestView;
import views.ReservationView;


public class App {

    private int controllerType;

    public int getControllerType() {
        return controllerType;
    }

    public void setControllerType(int controllerType) {
        this.controllerType = controllerType;
    }

    public void runGuest() {
        Guest model = new Guest();
        GuestView view = new GuestView(model);
        GuestController controller = new GuestController(model, view);
        controller.runApp();
    }

    public void runReservation() {
        Reservation model = new Reservation();
        ReservationView view = new ReservationView(model);
        ReservationController controller = new ReservationController(model, view);
        controller.runApp();
    }
}

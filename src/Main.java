import controllers.GuestController;
import controllers.ReservationController;
import models.Guest;
import models.Reservation;
import views.GuestView;
import views.ReservationView;

public class Main {

    public static void main(String[] args) {

//        Guest model = new Guest();
//        GuestView view = new GuestView(model);
//        GuestController controller = new GuestController(model, view);

        Reservation model = new Reservation();
        ReservationView view = new ReservationView(model);
        ReservationController controller = new ReservationController(model, view);
        controller.runApp();
    }
}

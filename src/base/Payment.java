package base;

public interface Payment {

    double calculatePayment(double price, int guestNumber, int nightsNumber);

    double calculatePayment(double price, int guestNumber, int kidsNumber, int nightsNumber);
}

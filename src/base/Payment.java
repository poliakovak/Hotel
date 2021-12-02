package base;

public interface Payment {

    double calculatePayment(double price, int guestsNumber, int nightsNumber);

    double calculatePayment(double price, int guestsNumber, int kidsNumber, int petsNumber, int nightsNumber);

    double calculatePayment(double dayPrice, int nightsNumber);

    double calculateGuestPayment(double price, double guestNumber);

}

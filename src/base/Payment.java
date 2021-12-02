package base;

public interface Payment {

    double calculatePayment(double price, int guestsNumber, int nightsNumber);

    double calculatePayment(double price, int guestsNumber, int kidsNumber, int nightsNumber);
}

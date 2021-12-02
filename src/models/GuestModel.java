package models;

import base.Payment;

public class GuestModel implements Payment {

    private String name;
    private int nightsNumber;
    private int guestsNumber;
    private int starsNumber;

    public String getName() {return name; }
    public void setName(String name) {this.name = name; }

    public int getNightsNumber() {return nightsNumber; }
    public void setNightsNumber(int nightsNumber) {this.nightsNumber = nightsNumber; }

    public int getGuestsNumber() {return guestsNumber; }
    public void setGuestsNumber(int guestsNumber) {this.guestsNumber = guestsNumber; }

    public int getStarsNumber() {return starsNumber; }
    public void setStarsNumber(int starsNumber) {this.starsNumber = starsNumber;}

    @Override
    public double calculatePayment(double price, int guestNumber, int nightsNumber) {
        return 0;
    }
}

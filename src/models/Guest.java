package models;

import base.Payment;
import base.Pricing;

public class Guest implements Payment, Pricing {

    private String name;
    private int nightsNumber;
    private int guestsNumber;
    private int kidsNumber;
    private int starsNumber;
    private final static int PRICE_BASE = 10000;
    private final static double STAR_RATE = 0.1;
    private final static double KIDS_RATE = 0.5;
    private final static double SINGLE_RATE = 0.5;

    public String getName() {return name; }
    public void setName(String name) {this.name = name; }

    public int getNightsNumber() {return nightsNumber; }
    public void setNightsNumber(int nightsNumber) {this.nightsNumber = nightsNumber; }

    public int getGuestsNumber() {return guestsNumber; }
    public void setGuestsNumber(int guestsNumber) {this.guestsNumber = guestsNumber; }

    public int getStarsNumber() {return starsNumber; }
    public void setStarsNumber(int starsNumber) {this.starsNumber = starsNumber;}

    public int getKidsNumber() {return kidsNumber; }
    public void setKidsNumber(int kidsNumber) {this.kidsNumber = kidsNumber; }

    @Override
    public double calculatePayment(double price, int guestNumber, int nightsNumber) {
        if (nightsNumber == 1) {
            nightsNumber -= nightsNumber * SINGLE_RATE;
        }
        return price * guestNumber * nightsNumber;
    }

    @Override
    public double calculatePayment(double price, int guestsNumber, int kidsNumber, int nightsNumber) {
        return calculatePayment(price, guestsNumber, nightsNumber) +
                calculatePayment(price, kidsNumber, nightsNumber) * KIDS_RATE;
    }

    @Override
    public double calculatePrice(int starsNumber) {
        return PRICE_BASE * starsNumber * STAR_RATE;
    }
}

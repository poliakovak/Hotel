package models;

import base.Payment;
import base.Pricing;

public class Guest implements Payment, Pricing {

    private String name;
    private int nightsNumber;
    private int guestsNumber;
    private int kidsNumber;
    private int petsNumber;
    private int starsNumber;
    private final static int PRICE_BASE = 10000;
    private final static double STAR_RATE = 0.1;
    private final static double KIDS_RATE = 0.5;
    private final static double PETS_RATE = 1.2;


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

    public int getPetsNumber() {return petsNumber; }

    public void setPetsNumber(int petsNumber) {this.petsNumber = petsNumber; }

    @Override
    public double calculatePayment(double price, int guestNumber, int nightsNumber) {
        return price * guestNumber * nightsNumber;
    }

    @Override
    public double calculatePayment(double price, int guestsNumber, int kidsNumber, int petsNumber, int nightsNumber) {
        return calculatePayment(price, guestsNumber, nightsNumber) +
                calculatePayment(price, kidsNumber, nightsNumber) * KIDS_RATE +
                calculatePayment(price, petsNumber, nightsNumber) * PETS_RATE;
    }

    @Override
    public double calculatePrice(int starsNumber) {
        return PRICE_BASE * starsNumber * STAR_RATE;
    }
}

package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import base.DateOperations;
import exceptions.DateInputException;

public class Reservation implements DateOperations{

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {return roomNumber; }
    public void setRoomNumber(Integer roomNumber) {this.roomNumber = roomNumber; }

    public Date getCheckIn() {return checkIn; }
    public void setCheckIn(Date checkIn) {this.checkIn = checkIn; }

    public Date getCheckOut() {return checkOut; }
    public void setCheckOut(Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DateInputException("Дата выезда должна быть позже даты заезда.");
        }
        this.checkOut = checkOut; }

    @Override
    public long calculateDuration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DateInputException("Даты бронирования для обновления " +
                    "должны быть датами в будущем.");

        }
        if (!checkOut.after(checkIn)) {
            throw new DateInputException("Дата выезда должна быть позже даты заезда.");

        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
}

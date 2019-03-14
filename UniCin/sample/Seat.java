package sample;

public class Seat {

    private int seatNumber;
    private char seatRow;
    private boolean booked;
    private String seatType;

    public Seat(int seatNumber, char seatRow, boolean booked, String seatType) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.booked = booked;
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public char getSeatRow() {
        return seatRow;
    }

    public boolean isBooked() {
        return booked;
    }

    public String getSeatType() {
        return seatType;
    }

    public void seatAvailability(){

    }

}

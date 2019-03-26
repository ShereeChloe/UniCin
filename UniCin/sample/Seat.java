package sample;

public class Seat {

    private int seatNumber;
    private char seatRow;
    private boolean booked;
    private String seatType;
    private Theatre theatre;

    public Seat(int seatNumber, char seatRow, boolean booked, String seatType, Theatre theatre) {
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.booked = booked;
        this.seatType = seatType;
        this.theatre = theatre;
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

    public Theatre getTheatre(){return theatre; }

}

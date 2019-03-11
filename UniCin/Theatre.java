public class Theatre {

    private int seats;
    private int bookedSeats;
    private int theatreNumber;
    private String theatreName;
    private int seatAvailability;

    public void Theatre(String theatreName, int theatreNumber, int seats){
        this.seats = seats;
        this.theatreNumber = theatreNumber;
        this.theatreName = theatreName;
        this.seatAvailability = seatAvailability;
    }

    public int getSeats(){
        return seats;
    }

    public int getTheatreNumber(){
        return theatreNumber;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public int getSeatAvailability() {
        return seatAvailability;
    }

    public boolean remainderSeats (int bookedSeats) {
        if (bookedSeats > 0) {
            this.seatAvailability -= bookedSeats;
            return true;
        }
        return false;
    }


}

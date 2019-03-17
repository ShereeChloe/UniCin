package sample;

public class Theatre {

    private int seats;
    private int bookedSeats;
    private int theatreNumber;
    private String theatreName;

    public Theatre()
    {

    }

    public Theatre(String theatreName, int theatreNumber, int seats){
        this.seats = seats;
        this.theatreNumber = theatreNumber;
        this.theatreName = theatreName;
    }

    public int availableSeats()
    {
        return seats - bookedSeats;
    }

    public boolean fullyBooked()
    {
        return bookedSeats == seats;
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

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }
}

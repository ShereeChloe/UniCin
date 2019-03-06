public class Theatre {

    private int seats;
    private int theaterNumber;
    private String theatreName;
    private int seatAvailability;

    public void Theater(String theatreName, int theaterNumber, int seats){
        this.seats = seats;
        this.theaterNumber = theaterNumber;
        this.theatreName = theatreName;
        this.seatAvailability = seatAvailability;
    }

    public int getSeats(){
        return seats;
    }

    public int getTheaterNumber(){
        return theaterNumber;
    }

    public String getTheatreName() {
        return theatreName;
    }


}

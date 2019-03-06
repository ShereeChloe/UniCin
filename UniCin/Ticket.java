public class Ticket {

    private Theatre theater;
    private Film film;
    private Seat seat;
    private int ticketNumber;
    private double startTime;
    private boolean reserveTicket;

    public Ticket(Theatre theater, Film film, Seat seat, int ticketNumber, double startTime, boolean reserveTicket) {
        this.theater = theater;
        this.film = film;
        this.seat = seat;
        this.ticketNumber = ticketNumber;
        this.startTime = startTime;
        this.reserveTicket = reserveTicket;
    }
}

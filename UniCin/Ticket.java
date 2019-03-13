public class Ticket extends Item {

    private Theatre theater;
    private Film film;
    private Seat seat;
    private int ticketNumber;
    private double startTime;
    private boolean reserveTicket;

    public Ticket(String name, double price, Theatre theater, Film film, Seat seat, int ticketNumber, double startTime,
                  boolean reserveTicket) {
        super(name, price);
        this.theater = theater;
        this.film = film;
        this.seat = seat;
        this.ticketNumber = ticketNumber;
        this.startTime = startTime;
        this.reserveTicket = reserveTicket;
    }

    public Theatre getTheater() {
        return theater;
    }

    public Film getFilm() {
        return film;
    }

    public Seat getSeat() {
        return seat;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public double getStartTime() {
        return startTime;
    }

    public boolean isReserveTicket() {
        return reserveTicket;
    }
}

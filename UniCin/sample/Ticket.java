package sample;

import javafx.scene.control.Alert;

public class Ticket extends Item {

    private Theatre theatre;
    private Film film;
    private Seat seat;
    private int ticketAmount;
    private double startTime;
    private boolean reserveTicket;

    public Ticket(String name, double price, Theatre theatre, Film film, Seat seat, int ticketAmount, double startTime,
                  boolean reserveTicket) {
        super(name, price);
        this.theatre = theatre;
        this.film = film;
        this.seat = seat;
        this.ticketAmount = ticketAmount;
        this.startTime = startTime;
        this.reserveTicket = reserveTicket;
    }

    public Ticket(int ticketAmount){
        this.ticketAmount = ticketAmount;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public Film getFilm() {
        return film;
    }

    public Seat getSeat() {
        return seat;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public double getStartTime() {
        return startTime;
    }

    public boolean isReserveTicket() {
        return reserveTicket;
    }

    public void display(){
        Alert confirmAddedToBasket = new Alert(Alert.AlertType.INFORMATION);
        confirmAddedToBasket.setHeaderText("You have added:" + getFilm() + getTicketAmount());
        confirmAddedToBasket.showAndWait();
    }
}

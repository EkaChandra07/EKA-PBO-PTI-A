public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;
    
    public Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }

    public String getTicketInfo() {
    
        String formatted = String.format(
            """
            Studio Number : %d
            Movie Name    : %s
            Price         : %.02f
            Seat          : %s
            """,
            studioNumber, movie.getTitle(), price, seat
        );

        return formatted;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getSeat() {
        return seat;
    }

    public static double getTicketPrice(String type) {
        if (type.equals("Premiere")) return 120000;
        if (type.equals("Imax")) return 100000;
        return 50000;
    }

}

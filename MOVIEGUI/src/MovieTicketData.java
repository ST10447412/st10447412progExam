public class MovieTicketData {
    private final String movieName;
    private final String numberOfTickets;
    private final String price;

// CONSTRUCTOR
    public MovieTicketData(String movieName, double numberOfTickets, int price) {
        this.movieName = movieName;
        this.numberOfTickets = String.valueOf(numberOfTickets);
        this.price = String.valueOf(price);

    }

    //GET METHODS FOR FIELDS

    public String getMovieName() {
        return movieName;
    }

    public String getNumberOfTickets() {
        return numberOfTickets;
    }

    public String getPrice() {
        return price;
    }


}

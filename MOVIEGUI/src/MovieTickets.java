public class MovieTickets implements IMovieTickets {

    //METHOD TO CALCULATE TOTAL TICKET PRICE

    @Override
    public double CalculateTotalTicketPrice(int numberOfTicketsStr, double ticketPriceStr) {
        double numberOfTickets = Double.parseDouble(String.valueOf(numberOfTicketsStr));
        double ticketPrice = Double.parseDouble(String.valueOf(ticketPriceStr));
        return numberOfTickets/ticketPrice;

    }

    // METHOD TO VALIDATE DATA
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        try{
            if(movieTicketData.getMovieName().isEmpty())return false;
            if (movieTicketData.getNumberOfTickets().isEmpty()) return false;
            if(Double.parseDouble(movieTicketData.getPrice()) <= 0) return false;

        }catch (NumberFormatException e){
            return false;
        }
        return false;
    }
}

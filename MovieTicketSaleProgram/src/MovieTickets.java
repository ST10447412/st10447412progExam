public class MovieTickets implements IMovieTickets {
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int totalSales = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {

            totalSales += movieTicketSales[i];
        }
        return totalSales;
    }

    @Override
    public int TopMovie(String[] movieNames, int[] totalSales) {

        int topMovie = 0;
        int topPosition = totalSales[0];
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > topPosition) {
                topMovie = i;
            }
        }
        return topMovie;
    }
}

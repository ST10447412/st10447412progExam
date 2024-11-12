import static org.junit.jupiter.api.Assertions.*;

class IMovieTicketsTest {

    @org.junit.jupiter.api.Test
    void CalculateTotalSales_ReturnsExpectedTotalSales() {
        IMovieTickets testClass = new MovieTickets();
        int[] movieTicketSales = {3000,1500,1700};
        int expected = 6200;
        int actual = testClass.TotalMovieSales(movieTicketSales);
        assertEquals(expected,actual,1);
    }

    @org.junit.jupiter.api.Test
    void topMovieSales_ReturnTopMovie() {
        IMovieTickets testClas = new MovieTickets();
        String[] TopMovie = {"Oppenheimer"};
        int []totalSales = {6300};
        String expected = "Oppenheimer";
        int actual = testClas.TopMovie(TopMovie,totalSales);
        assertEquals(expected,actual,"");
    }
}
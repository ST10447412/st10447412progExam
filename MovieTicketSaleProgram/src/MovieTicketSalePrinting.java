public class MovieTicketSalePrinting {
    private int[][] movieTicketSales;
    private int[] totalSales;
    private String [] movieNames;
    MovieTickets movie;

    public MovieTicketSalePrinting(String[] movieNames, int[] totalSales, int[][] movieTicketSales) {
        this.movieNames = movieNames;
        this.totalSales = totalSales;
        this.movieTicketSales = movieTicketSales;
        this.movie = movie;
    }

    public void PrintHeadings(){
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println();
        System.out.println("\t\t\t\tJAN" + "\t\t\tFEB"+ "\t\t\tMAR");
        System.out.println("---------------------------------------------------------");

    }
    public void printMovieSales(){
        for (int i = 0; i < movieNames.length ; i++) {
            System.out.println();
            System.out.print(movieNames[i] + "\t\t" );
            for (int j = 0; j < totalSales.length ; j++) {
                System.out.print( movieTicketSales[i][j] + "\t\t");
            }

        }
        System.out.println();
        System.out.println();
    }

    public void printTotalSales(){

        for (int i = 0; i < movieNames.length ; i++) {
            System.out.println("Total movie ticket sales for " + movieNames[i] + ":" + totalSales[i]);
        }
        System.out.println();
    }

    public void printTopMovie() {

        MovieTickets topMovie = new MovieTickets();
        System.out.println("Top performing movie : " + topMovie.TopMovie(movieNames,totalSales));
    }
}

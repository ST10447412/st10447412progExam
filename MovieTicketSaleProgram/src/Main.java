//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] movieNames = {"Napolean", "Oppenheimer"};
        int[][] movieTicketSales = {{3000, 1500, 1700},
                {3500, 1200, 1600}};
        int[] totalSales = new int[3];

        MovieTicketSalePrinting print = new MovieTicketSalePrinting(movieNames, totalSales, movieTicketSales);
        print.PrintHeadings();
        print.printMovieSales();


            int total = 0;
            int total2 = 0;
            for (int j = 0; j < movieTicketSales.length; j++) {

                total =  movieTicketSales[0][0] + movieTicketSales[0][1] +  movieTicketSales[0][2];
                total2 =  movieTicketSales[1][0] + movieTicketSales[1][1] +  movieTicketSales[1][2];

            }
            System.out.println("Total movie ticket sales for " + movieNames[0] + " : " + total);
            System.out.println("Total movie ticket sales for " + movieNames[1] + " : " + total2);
        System.out.println();
        System.out.println("Top performing movie: Oppenheimer");
    }
}
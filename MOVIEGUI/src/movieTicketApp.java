import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class movieTicketApp extends JFrame {
private final JComboBox<String> movieNameComboBox;
private final JTextField ticketsField,priceField;
private final JTextArea reportArea;
private final MovieTickets movie;

movieTicketApp(){
    movie = new MovieTickets();


    setTitle("Estate Agent Report");
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());


    JPanel inputPanel = new JPanel(new GridLayout(5,2));
    movieNameComboBox = new JComboBox<>(new String[]{"","Napolean","Oppenheimer"});
    ticketsField = new JTextField();
    priceField = new JTextField();
    reportArea = new JTextArea();

    //Adding GUI elements

    inputPanel.add(new JLabel("MOVIE"));
    inputPanel.add(movieNameComboBox);
    inputPanel.add(new JLabel("NUMBER OF TICKETS"));
    inputPanel.add(ticketsField);
    inputPanel.add(new JLabel("TICKET PRICE"));
    inputPanel.add(priceField);


    add(inputPanel , BorderLayout.NORTH);
    add(new JScrollPane(reportArea), BorderLayout.CENTER);

    // menu bar
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");

    JMenuItem exit = new JMenuItem("Exit");
    exit.addActionListener(e -> System.exit(0));
    fileMenu.add(exit);

    //Menu items

    JMenuItem processReportItem = new JMenuItem("Process ");
    processReportItem.addActionListener(e -> processReport());
    editMenu.add(processReportItem);

    JMenuItem clearItem = new JMenuItem("Clear");
    clearItem.addActionListener(e-> clearFields());
    editMenu.add(clearItem);


    JMenuItem saveReportItem = new JMenuItem("Save Report");
    saveReportItem.addActionListener(e-> saveReport());
    editMenu.add(saveReportItem);

    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    setJMenuBar(menuBar);

}

// Methods for menu items
private void processReport() {
    String movieName = (String) movieNameComboBox.getSelectedItem();
    int ticketsStr = (int) Double.parseDouble(ticketsField.getText());
    int numberOfTicketsStr = Integer.parseInt(priceField.getText());



    MovieTicketData info = new MovieTicketData(movieName,ticketsStr,numberOfTicketsStr);
    if (movie.ValidateData(info)) {
        JOptionPane.showMessageDialog(this, "Invalid data in text fields!");

    } else {
        double tickets = Double.parseDouble(String.valueOf(ticketsStr));
        double numberOfTickets = Double.parseDouble(String.valueOf(numberOfTicketsStr));
        double pay = movie.CalculateTotalTicketPrice(numberOfTicketsStr,ticketsStr);

        reportArea.setText("MOVIE REPORT: \n");
        reportArea.append("MOVIE NAME: " + movieName + "\n");
        reportArea.append("MOVIE TICKET PRICE: " + pay + "\n");
        reportArea.append("NUMBER OF TICKETS " + tickets + "\n");
        reportArea.append("TOTAL TICKET PRICE: " + pay + "\n");

    }
}

private void clearFields(){
    movieNameComboBox.setSelectedIndex(0);
    ticketsField.setText("");
    priceField.setText("");
    reportArea.setText("");

}

private void saveReport(){
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))){
         writer.write(reportArea.getText());
         JOptionPane.showMessageDialog(this,"Report saved to report.txt ");

    }catch(IOException e){
        JOptionPane.showMessageDialog(this,"Error saving file" + e.getMessage());
    }
}
//Main method to run GUI application
    public static void main(String[] args) {

    SwingUtilities.invokeLater(() ->{
        movieTicketApp app = new movieTicketApp();
        app.setVisible(true);
        });

    }
}

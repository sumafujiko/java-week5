import javax.swing.JOptionPane;
public class cinemaTicketsApp {
    public static void main(String[] args) {
        //vars
        String day;
        int age, numTickets;
        double cost;

        //objects
        cinemaTickets addCinemaTickets;
        addCinemaTickets = new cinemaTickets();

        //input
        day = JOptionPane.showInputDialog("Welcome to the cinema! Would you like to book your tickets for a weekday or weekend? (Please enter 'weekday' or 'weekend')");
        age = Integer.parseInt(JOptionPane.showInputDialog("Perfect, and how old are you?"));
        numTickets = Integer.parseInt(JOptionPane.showInputDialog("Great, now how many tickets would you like to purchase?"));
        
        //set
        addCinemaTickets.setAge(age);
        addCinemaTickets.setDay(day);
        addCinemaTickets.setNumTickets(numTickets);

        //compute
        addCinemaTickets.computePrice();

        //get
        cost = addCinemaTickets.getCost();

        //output
        JOptionPane.showMessageDialog(null, "Altogether " + numTickets + " tickets will cost you €" + cost + ". Would you like to pay with cash or card?");
    }
}
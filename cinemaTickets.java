public class cinemaTickets {
    private int age, numTickets;
    private String day;
    private double cost;

    public cinemaTickets() {
        age = 0;
        day = "";
        numTickets = 1;
        cost = 0.0;
    }

    //set
    public void setAge(int age) {
        this.age = age;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    //compute

    public void computePrice() {
        if (age < 18 && age > 0) {
            if (day.equalsIgnoreCase("weekend")) {
                cost = 8.0*numTickets;
            } else {
                cost = 10.0*numTickets;
            } 
        } else if (age >= 18) {
            if (day.equalsIgnoreCase("weekend")) {
                cost = 10.50*numTickets;
            } else {
                cost = 12.50*numTickets;
            }
        } 
        }
    //get
    public double getCost() {
    return cost;
    }
}
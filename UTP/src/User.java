public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private Ticket[] ticketLists;
    private final static int MAX_TICKET = 100;
    
    public User(String email, String password, String fullName, double balance) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = balance;
        ticketLists = new Ticket[MAX_TICKET];
    }

    public boolean addTicket(Ticket ticket) {
        for(int i = 0; i < MAX_TICKET; i++) {
            if(ticketLists[i] == null) {
                this.ticketLists[i] = ticket;
                return true;
            }
        }

        return false;
    }

    public User name(String name) {
        this.fullName = name;
        return this;
    }

    public void displayAllTickets() {
        for(int i = 0; i < MAX_TICKET; i++) {
            if (this.ticketLists[i] != null) 
                System.out.println(this.ticketLists[i].getTicketInfo());                
        }
    }

    public boolean isMatch(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
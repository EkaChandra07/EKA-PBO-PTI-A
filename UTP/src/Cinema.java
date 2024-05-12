public class Cinema {
    private String name;
    private User[] listUsers;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema(String name, int sc) {
        this.name = name;
        listUsers = new User[sc * 25];
        listStudio = new Studio[sc];
        studioCapacity = sc;
        init();

        // hack code lol
        registerUser(new User("tes", "tes", "Aleksius Aurelia", 1000000));
    }

    public boolean registerUser(User user) {
        for(int i =0 ;i < studioCapacity * 25; i++) {
            if(listUsers[i] == null) {
                // successfully adding user to db
                listUsers[i] = user;
                return true;
            }
        }

        return false;
    }

    public User authenticateUser(String email, String password) {
        for(int i = 0; i < studioCapacity * 25; i++)  {
            if(listUsers[i] == null) break;

            if (listUsers[i].isMatch(email, password)) {
                return listUsers[i];
            }
        }

        return null;
    }

    public void displayAvailableStudio() {
        System.out.println("-".repeat(50));
        for(int i = 0; i < studioCapacity; i++) {
            if (listStudio[i] == null) {
                System.out.print("|\n");
                break;
            }
            System.out.printf("| %d ", i + 1);
        }
        System.out.println("-".repeat(50));
    }

    public void displayListStudio() {
        for(int i = 0; i < studioCapacity; i++) {
            if(listStudio[i] == null) break;
            System.out.printf("Studio : %d\n", i + 1);
            System.out.printf("Type   : %s\n", listStudio[i].getType());
            System.out.printf("Movie  : %s\n", listStudio[i].getMovie().getTitle());
            System.out.println("-".repeat(40));
        }
    }

    public void displayStudioDetail(int studioNumber) {
        // validating studioNumber
        if (studioNumber < 0 || studioNumber >= studioCapacity) {
            System.out.println("Invalid studio number");
            return;
        }

        if (listStudio[studioNumber - 1] == null) {
            System.out.println("Studio is empty");
            return;
        }

        System.out.println(listStudio[studioNumber - 1].getStudioInfo());
    }

    public boolean addStudioWithMovie(String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        Movie movie = new Movie(movieTitle, movieRating, movieGenres);

        Studio studio = new Studio(studioType);
        studio.setMovie(movie);

        for (int i = 0; i < studioCapacity; i++) {
            if (listStudio[i] == null) {
                listStudio[i] = studio;
                return true;
            }
        }

        return false;
    }

    public boolean bookTicket(User user, int studioNumber, char row, int col) {
        if (studioNumber < 0 || studioNumber > studioCapacity) {
            return false;
        }

        Studio studio = listStudio[studioNumber-1];

        if (studio == null) {
            return false;
        }

        if (studio.isBooked(row, col) != 0) {
            System.out.println("Kursi sudah direservasi");
            return false;
        }

        double price = Ticket.getTicketPrice(studio.getType());

        if (user.getBalance() < price) {
            System.out.println("Saldo tidak memenuhi");
            return false;
        }

        studio.reserve(row, col);
        Ticket ticket = new Ticket(studio.getMovie(), studioNumber, ""+row+""+col);
        ticket.setPrice(Ticket.getTicketPrice(studio.getType()));
        user.setBalance(user.getBalance() - price);

        user.addTicket(ticket);

        return true;
    }

    public String getName() {
        return name;
    }

    private void init() {
        addStudioWithMovie("Imax", "Inception", 9.5, new String[]{"Action", "Thriller", "Science Fiction"});
        addStudioWithMovie("Premiere", "The Shawshank Redemption", 9.7, new String[]{"Drama"});
        addStudioWithMovie("Reguler", "The Lord of the Rings: The Fellowship of the Ring", 9.0, new String[]{"Adventure", "Fantasy"});
        addStudioWithMovie("Imax", "Avatar", 8.8, new String[]{"Action", "Adventure", "Science Fiction"});
        addStudioWithMovie("Premiere", "The Godfather", 9.8, new String[]{"Crime", "Drama"});
        addStudioWithMovie("Reguler", "Forrest Gump", 8.9, new String[]{"Drama", "Romance"});
        addStudioWithMovie("Imax", "Interstellar", 9.3, new String[]{"Adventure", "Drama", "Sci-Fi"});
        addStudioWithMovie("Premiere", "Pulp Fiction", 9.4, new String[]{"Crime", "Drama"});
        addStudioWithMovie("Reguler", "The Matrix", 8.7, new String[]{"Action", "Sci-Fi"});
        addStudioWithMovie("Imax", "The Dark Knight", 9.9, new String[]{"Action", "Crime", "Drama"});
    }
}

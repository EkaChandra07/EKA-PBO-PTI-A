public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;
    private int seatRow;
    private int seatCol;

    public Studio(String type) {
        this.type = type;
        setSeats();

    }

    public String getStudioInfo() {
        String[] rows = new String[seatRow];
        String chairs = "";
        
        chairs += String.format("-".repeat(40)) + "\n";

        chairs += "- | ";
        
        for (int i = 0; i < seatRow; i++) {
            rows[i] = "" + (char)('A' + i);
        }

        for (int i = 0; i < seatCol; i++) {
            chairs += String.format("%s | ", i + 1);
        }

        chairs += "\n";

        for (int i = 0; i < seatRow; i++) {
            chairs += String.format("%s | ", rows[i]);
            for (int j = 0; j < seatCol; j++) {
                chairs += String.format("%s | ", (seats[i][j] ? "X" : "O"));
            }
            chairs += "\n";
        }
        chairs += String.format("-".repeat(40)) + "\n";
        chairs += String.format(
            """
            Movie : %s
            Type  : %s
            Price : %.02f        
            Genre : %s
            """, 
            movie.getTitle(), 
            type, Ticket.getTicketPrice(this.type), 
            movie.getGenres()
        );

        return chairs;
    }

    public int isBooked(char row, int col) {
        if(!isValidRowCol(row, col)) return -1;

        if(seats[row-'A'][col - 1]) return 1;

        return 0;
    }
    
    public boolean reserve(char row, int col) {
        if(!isValidRowCol(row, col)) return false;

        seats[row-'A'][col - 1] = true;

        return true;
    }

    public String getType() {
        return type;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    private void setSeats() {
        switch (type) {
            case "Premiere":        
                seatRow = 6; seatCol = 4;
    
                break;

            case "Imax" :
                seatRow = 8; seatCol = 9;
                break;
            
            default:
                seatRow = 5; seatCol = 5;
                break;
        }

        seats = new boolean[seatRow][seatCol];
    }

    private boolean isValidRowCol(char row, int col) {
        return (row - 'A' >= 0 || row - 'A'  < seatRow) 
            && (col >= 0 || col - 1 < seatCol);
    }
}

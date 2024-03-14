public class Game {
    private String title;
    private String genre;
    private int releaseYear;
    
    
    public Game(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
    
    
    public String getTitle() {
        return title;
    }
    
    
    public String getGenre() {
        return genre;
    }
    
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    
    public static void main(String[] args) {
        
        Game genshinImpact = new Game("Genshin Impact", "Action RPG", 2019);
        
        
        System.out.println("Title: " + genshinImpact.getTitle());
        System.out.println("Genre: " + genshinImpact.getGenre());
        System.out.println("Release Year: " + genshinImpact.getReleaseYear());
        
        
        genshinImpact.setGenre("Open-world Action RPG");
        genshinImpact.setReleaseYear(2020);
        
        
        System.out.println("\nUpdated Information:");
        System.out.println("Title: " + genshinImpact.getTitle());
        System.out.println("Genre: " + genshinImpact.getGenre());
        System.out.println("Release Year: " + genshinImpact.getReleaseYear());
    }
}

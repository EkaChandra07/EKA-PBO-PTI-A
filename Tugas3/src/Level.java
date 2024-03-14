public class Level {
    private int level;
    private String kesulitan;
    
    public void stage(int level, String kesulitan) {
        this.level = level;
        this.kesulitan = kesulitan;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String getKesulitan() {
        return kesulitan;
    }
    
    public void naikLevel() {
        
        level++;
        switch (kesulitan) {
            case "Mudah":
                kesulitan = "Sedang";
                break;
            case "Sedang":
                kesulitan = "Sulit";
                break;
            case "Sulit":
                kesulitan = "Sangat Sulit";
                break;
            default:
                kesulitan = "Tidak Diketahui";
        }
        System.out.println("Level naik menjadi " + level + " dengan tingkat kesulitan " + kesulitan);
    }
    
    public static void main(String[] args) {
        
        Level stage1 = new Level();
        
        
        stage1.stage(3, "Sulit");
        
        
        System.out.println("Level: " + stage1.getLevel());
        System.out.println("Tingkat Kesulitan: " + stage1.getKesulitan());
        
        
        stage1.naikLevel();
    }
}

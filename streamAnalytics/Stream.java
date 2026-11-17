

public class Stream{

    // Instance Variables 
    private String title;
    private double duration;
    private int averageViewers; 
    private int peakViewers;
    private int followersGained;

    // initializers 
    public Stream(String title, double duration, int averageViewers, int peakViewers, int followersGained){
        this.title = title;
        this.duration = duration;
        this.averageViewers = averageViewers;
        this.peakViewers = peakViewers;
        this.followersGained = followersGained;
    }

    // Getter methods 
    public String getTitle(){return title;}
    public double getDuration(){return duration;}
    public int getAverageViewers(){return averageViewers;}
    public int getPeakViewers(){return peakViewers;}
    public int getFollowersGained(){return followersGained;}

    // Method to display stream info
    public void displayInfo(){
        System.out.println("Stream Title: " + title);
        System.out.println("Stream Duration: " + duration);
        System.out.println("Average Viewers: " + averageViewers);
        System.out.println("Peak Viewers: " + peakViewers);
        System.out.println("Followers Gained: " + followersGained + "\n");
    }

    public static void main(String[] args){

    }

}
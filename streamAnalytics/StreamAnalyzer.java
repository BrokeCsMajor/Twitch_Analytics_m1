import java.util.ArrayList;

public class StreamAnalyzer {
    private ArrayList<Stream> streams;

    public StreamAnalyzer(){
        streams = new ArrayList<>();
    }

    public void addStream(Stream s){
        streams.add(s);
    }

    public int getTotalStreams(){
        return streams.size();
    }

    public void getStreamHistory(){
        if (streams.isEmpty()){
            System.out.println("No streams have been recorded");
            return;
        }

        for (Stream indivdual : streams){
            indivdual.displayInfo();
        }
    }

    public double getTotalHours(){

        double sum = 0;

        for(int i = 0; i < streams.size(); i++){
            Stream current = streams.get(i);
            sum += current.getDuration();
        }

        return sum;
    }

    public double getAverageViewers(){
        double sum = 0;
        for(int i = 0; i < streams.size(); i++){
            Stream current = streams.get(i);
            sum += current.getAverageViewers();
        }
        return sum / streams.size();
    }

    public int getTotalFollowers(){
        int sum = 0;
        for(int i = 0; i < streams.size(); i++){
            Stream current = streams.get(i);
            sum += current.getFollowersGained();
        }
        return sum;
    }

    public Stream findBestStream(){
        int highest = streams.get(0).getAverageViewers();
        Stream bestStream = streams.get(0);
        for(int i = 1; i < streams.size(); i++){
            Stream current = streams.get(i);

            if(current.getAverageViewers() >= highest){
                bestStream = current;
            } 
        }

        return bestStream;
    }
}

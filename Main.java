import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){

        ArrayList<Stream> steamAnalytics = new ArrayList<>();   

        // 3 stream objects
        Stream stream1 = new Stream("Minecraft Survival", 3.5, 85, 142, 12);
        Stream stream2 = new Stream("Just Chatting", 2.0, 120, 230, 25);
        Stream stream3 = new Stream("Valorant Ranked", 4.0, 67, 115, 8); 

        // adding Stream objects to arraylist
        steamAnalytics.add(stream1);
        steamAnalytics.add(stream2);
        steamAnalytics.add(stream3);

        // display each stream's information
        for (int i = 0; i < steamAnalytics.size(); i++){
            Stream current = steamAnalytics.get(i);
            current.displayInfo();
        }

        // Scanner object 
        Scanner k = new Scanner(System.in);

        // StreamAnalyzer Object
        StreamAnalyzer analyzer = new StreamAnalyzer();
        int userChoice; 

        do {
            System.out.println("======= STREAM ANALYTICS =======");
            System.out.println("");
            System.out.println("1. Add New Stream");
            System.out.println("2. View Stream History");
            System.out.println("3. Calculate Statistics");
            System.out.println("4. Find Best Performing Stream");
            System.out.println("5. Compare Streams");
            System.out.println("6. Save Data");
            System.out.println("7. Exit");
            System.out.println("");
            System.out.println("Enter your choice: ");

            userChoice = k.nextInt();

            switch (userChoice){
                case 1:
                    
            }

        } while (!(userChoice == 7));
    }
}

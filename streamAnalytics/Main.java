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
                    k.nextLine();

                    System.out.println("Please enter the Stream title: ");
                    String title = k.nextLine();

                    System.out.println("Please enter the duration of the stream: ");
                    double duration = k.nextDouble();
                    while (duration <= 0){
                        System.out.println("Invalid input! Please try again: ");
                        duration = k.nextDouble();
                    }

                    System.out.println("Please enter the average viewers for the stream: ");
                    int average = k.nextInt();
                    while (average <= 0){
                        System.out.println("Invalid input! Please try again: ");
                        average = k.nextInt();
                    }

                    System.out.println("Please enter the peak viewers for the stream: ");
                    int peak = k.nextInt();
                    while (peak <= 0){
                        System.out.println("Invalid input! Please try again: ");
                        peak = k.nextInt();
                    }

                    System.out.println("Please enter how many followers were gained: ");
                    int gained = k.nextInt();
                    while (gained <= 0){
                        System.out.println("Invalid input! Please try again: ");
                        gained = k.nextInt();
                    }
                    
                    Stream newStream = new Stream(title, duration, average, peak, gained);
                    analyzer.addStream(newStream);
                    System.out.println("Success!\n");
                    break;
            }

        } while (!(userChoice == 7));
    }
}

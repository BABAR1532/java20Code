import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Write a program to convert a given number of hours into minutes.

        System.out.println("Enter the value of hour to convert in minutes:");
        double hour = reader.nextDouble();

        double minutes = hour * 60;

        System.out.println(hour + " have " + minutes + " minutes");

        // closing reader
        reader.close();
    }

}

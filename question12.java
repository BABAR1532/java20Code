import java.util.Scanner;

public class question12 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Develop a program to convert a given number of kilometers into miles.

        System.out.println("Enter kilometers to convert in miles ");
        double kilometers = reader.nextDouble();

        System.out.println(kilometers + " in miles is " + (kilometers * 0.621371));

        // Closing reader
        reader.close();
    }

}

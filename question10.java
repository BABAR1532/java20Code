import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Create a program to determine if a given number is even or odd.

        System.out.println("Enter the number");
        int number = reader.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + result);

        // Closing reader
        reader.close();
    }

}

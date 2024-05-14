import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Write a program to calculate the square of a given number.
        System.out.println("Enter the number");
        int number = reader.nextInt();

        System.out.println("Square of " + number + " is  " + (number * number));

        // closing reader
        reader.close();

    }

}

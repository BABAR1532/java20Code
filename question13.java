import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Implement a program to calculate the sum of the digits of a given number.
        System.out.println("Enter the number");
        int number = reader.nextInt();

        int sumDigit = 0;

        while (number != 0) {

            int lastDigit = number % 10;
            sumDigit += lastDigit;

            number /= 10;
        }

        System.out.println("sum of digit of your number is " + sumDigit);

        // Close reader
        reader.close();

    }
}

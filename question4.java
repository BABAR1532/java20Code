import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Develop a program to determine if a given year is a leap year.

        System.out.println("Enter year: ");
        int year = reader.nextInt();

        // Using conditional to evaluate year is leap or not!
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " not a leap year");
        }

        // Closing reader
        reader.close();
    }

}

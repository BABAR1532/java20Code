import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Create a program to convert temperatures between Celsius and Fahrenheit.

        System.out.println("Enter the unit in which you want to convert: [1] for clesius and [2] Fahrenheit ->");
        int unit = reader.nextInt();

        System.out.println("Enter the value of temperature: ");
        double temperature = reader.nextFloat();

        if (unit == 1) {

            if (temperature > 50) {
                double celsius = (5.0 / 9.0) * (temperature - 32);
                System.out.println("Your ans is: " + celsius + "C");
            } else {
                System.out.println("Enter the valid data to calculate!");
            }

        } else {

            if (temperature > 10) {
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Your ans is: " + fahrenheit + "F");
            } else {
                System.out.println("Enter the valid data to calculate!");
            }
        }

        // Closing reader
        reader.close();

    }
}

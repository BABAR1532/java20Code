import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Write a program to calculate the BMI (Body Mass Index) given a person's
        // weight and height.

        System.out.println("Enter the height of person in meters:");
        double height = reader.nextDouble();

        System.out.println("Enter the weight of person in kg:");
        double weight = reader.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Bmi of person is " + bmi);

        // closing reader
        reader.close();
    }

}

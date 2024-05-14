import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Write a program to calculate the average of a list of exam scores.

        System.out.println("Enter the number of exam score");
        int numScores = reader.nextInt();

        // Creating array according to numbScores
        int[] examScores = new int[numScores];

        // Taking value from user for each exam score
        for (int i = 0; i < numScores; i++) {
            System.out.print("Enter the Score " + (i + 1) + ": ");
            examScores[i] = reader.nextInt();

        }

        // Calcuating value of all exam score
        int sum = 0;

        for (int i = 0; i < numScores; i++) {
            sum += examScores[i];
        }

        System.out.println();

        // Calculating average of exam score:
        int avgScore = sum / numScores;
        System.out.println("Average of score is " + avgScore);

        // closing reader
        reader.close();

    }
}

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Develop a program to calculate the average of three exam scores.

        System.out.println("Enter the first score :");
        int num1 = reader.nextInt();

        System.out.println("Enter the second score");
        int num2 = reader.nextInt();

        System.out.println("Enter the third score");
        int num3 = reader.nextInt();

        System.out.println("Average of three exam score is " + ((num1 + num2 + num3) / 3));

        // reader close
        reader.close();
    }

}

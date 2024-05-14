import java.util.Scanner;

public class question19 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number you want fibonacci series upto");
        int number = reader.nextInt();

        fibonacci(number);

        // Closing reader
        reader.close();
    }

    // function of fibonacci series
    public static void fibonacci(int number) {

        System.out.print(0 + " " + 1 + " ");
        int start = 0;
        int end = 1;

        for (int i = 0; i < (number - 2); i++) {
            int ans = start + end;
            System.out.print(ans + " ");
            start = end;
            end = ans;
        }

    }

}

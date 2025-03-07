import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int sum = 0 ;
        int number = choice;

        while (number != 0) {
            sum = sum * 10 + number % 10;

            number /=10;
        }
        if (sum == choice) {
            System.out.println("\n" + choice + " Is A Palindrome number.");
        }
        else {
            System.out.println("\n" + choice + " Is Not a Palindrome number.");
        }
    }

}
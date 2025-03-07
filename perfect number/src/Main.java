import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter A Number: ");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        int i = 1 ;
       while (i < number){
           if ( number % i == 0){
               sum += i;
           }
           ++i;
       }

    if (sum == number) {
        System.out.println(number + " Is a Perfect Number");
    }
    else {
        System.out.println(number + " Isn't a Perfect Number");
    }

    }
}
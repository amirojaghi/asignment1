public class Main {
    public static void main(String[] args) {
        System.out.println("Prime Numbers From 1 to 100: ");

        for (int num = 1 ; num <= 100; num++){
            boolean prime = true;

            for (int i = 2; i <= num / 2 ; i++){
                if(num % i == 0){
                    prime = false;
                }
            }
            if ( num == 1){
                prime = false;
            }
            if (prime == true){
                System.out.println(num);
            }
        }
    }
}
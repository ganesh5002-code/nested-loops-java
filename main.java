import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int test_cases = scanner.nextInt();
        
        for(int i = 1; i <= test_cases; i++) {
            System.out.print("Enter number" + i + ": ");
            int num = scanner.nextInt();

            int count = 0;
            for(int div = 2; div * div <= num; div++) {
                if(num % div == 0) {
                    count++;
                    break;
                }
            }

            if(num<=1){
                System.out.println("Not a prime number.");
            } else if(count==0) {
                System.out.println("It is a prime number.");
            } else {
                System.out.println("Not a prime number.");
            }
        }
    }
}
import java.util.Scanner;

class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your minimum whole number: ");
        int low = sc.nextInt();

        System.out.print("Enter your maximum whole number (lower than minimum): ");
        int high = sc.nextInt();

        for(int n = low; n<= high; n++) {
            if(n <= 1) continue;

            int count = 0;
            for(int div = 2; div * div <= n; div++) {
                if(n % div == 0) {
                    count++;
                    break;
                }

            }if(count == 0) {
                System.out.println(n);
            }
        }
    }
}
import java.util.Scanner;

class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number(n) to determine its factors: ");
        int num = sc.nextInt();

        for(int div=2; div * div <= num; div++) {
            while(num % div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }
        }

        if(num != 1) {
            System.out.print(num);
        }

    }
}
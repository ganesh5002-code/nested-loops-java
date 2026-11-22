import java.util.Scanner;

class main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the whole number: ");
        int num = scn.nextInt();

        System.out.print("Enter the rotation count: ");
        int r = scn.nextInt();

        if (num == 0) {
            System.out.println("Rotated number: 0");
            scn.close();
            return;
        }

        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num);

        int temp = num;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        r = r % nod;
        if (r < 0) {
            r = r + nod;
        }

        int mult = (int) Math.pow(10, nod - 1);

        for (int i = 1; i <= r; i++) {
            int lastDigit = num % 10;
            int remaining = num / 10;
            num = (lastDigit * mult) + remaining;
        }

        System.out.println("Rotated number: " + (num * sign));
        scn.close();
    }
}


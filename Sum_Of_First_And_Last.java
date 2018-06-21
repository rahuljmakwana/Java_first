import java.util.Scanner;

public class Sum_Of_First_And_Last {

    public static void main(String args[]) {

        int r, num, rev = 0, firstd, lastd, sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number :");

        num = sc.nextInt();

        lastd= num % 10;

        while (num > 0) {

            r = num % 10;

            rev = rev * 10 + r;

            num = num / 10;
        }

        firstd= rev % 10;

        sum = firstd + lastd;

        System.out.println("\nThe Sum of First and Last Digit is :" + sum);


    }
}
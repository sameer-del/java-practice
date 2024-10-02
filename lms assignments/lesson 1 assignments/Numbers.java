//WRITE A JAVA PROGRAM TO PRINT 10 9 8 7 6 5 4 3 2 1 USING DECREMENT OPERATOR?

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a count number:");
        int num = input.nextInt();
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }
}

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
             System.out.println("enter a year:");
        int year = input.nextInt();
        if (year % 4 == 0) {
            System.out.printf("the %s is a leap year", year);
        } else {
            System.out.printf("the %s is not a leap year", year);
        }
        }
       
    }

}

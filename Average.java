import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a first number");
        int num1 = input.nextInt();
        System.out.print("enter a second number");
        int num2 = input.nextInt();
        System.out.print("enter a third number");
        int num3 = input.nextInt();

        double ans = calculate(num1, num2, num3);
        System.out.println(ans);
    }
    static Double calculate(int num1, int num2, int num3) {
        int sum = num1 +num2 +num3;
        return (double) (sum/3);
}}

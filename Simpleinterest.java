import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount initial amount: ");
        //we use double because the principal amount is in float number also so we use double
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period  in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R) in percentage: ");
        //in lab the question doesnot talk about the interest to calculate the simple interest we must have to know the rate of intetrest
        double rate = scanner.nextDouble();

        // Calculate simple interest this is the universal formula
        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}

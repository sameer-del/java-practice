import java.util.Scanner;
public class InputOPerate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int num1 = input.nextInt();
        System.out.println("enter another number:");
        int num2 = input.nextInt();
        System.out.println("enter a operator:");
        String operator = input.next();
        if(operator.equals("+")){
            System.out.println(num1 + num2);
        }
        if(operator.equals("*")){
            System.out.println(num1 * num2);
        }
        if(operator.equals("-")){
            System.out.println(num1 - num2);
        }
        if(operator.equals("/")){
            System.out.println(num1 / num2);
        }

    }
}

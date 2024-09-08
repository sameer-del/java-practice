import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("first number:");
        int number1 = in.nextInt();
        System.out.println("second number:");
        int number2 = in.nextInt();
        if(number1 > number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }
    }
}

import java.util.Scanner;
public class Latdigit {
    public static void main(String[] args) {
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = input.nextInt();
       /*  int dupans = a/10; */
        int ans = a % 10; 
        System.out.println( "just kidding here is the answer: "+ ans);
        }
    }
}

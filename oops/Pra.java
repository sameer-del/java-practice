import java.util.Scanner;   
public class Pra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principle");
        int principle = in.nextInt();
        System.out.println("enter the time");
        int time = in.nextInt();
        System.out.println("enter the rate35");
        int rate=in.nextInt();
        int si = principle*time*rate/100;
        System.out.println(si);
    }
}

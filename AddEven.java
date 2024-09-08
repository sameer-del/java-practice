import java.util.Scanner;
public class AddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int checkNum = in.nextInt();
        if(checkNum %2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

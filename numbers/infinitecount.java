import java.util.Scanner;
public class infinitecount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean cut = true;
       int even=0;
       int odd=0;
        while (cut) {
            System.out.print("enter a input: ");
            int num=input.nextInt();
            if(num == -1){
                cut = false;
            }
            if(num%2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("number of even:" + even + " number of odd:" + odd);
    }
}

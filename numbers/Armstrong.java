import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ente a start:");
        int start = input.nextInt();
        System.out.print("ente a end:");
        int end = input.nextInt();
        boolean present = false;
        for(int i=start;i<end;i++){
           if(checkarm(i)){
            System.out.println(i);
            present = true;
           }
        }
        if(!present){
            System.out.println("there is no armstrong number");
        }
        
        
    }
    static Boolean checkarm(int i){
        int sum =0;
        int len =(int) Math.log10(i)+1;
        int act = i;
        while(i>0){
            int rem = i%10;
            sum += Math.pow(rem,len);
            i=i/10;
        }
        if(act == sum){
            return true;
        }else{
            return false;
        }
        }
        
}

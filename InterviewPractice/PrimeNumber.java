package InterviewPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        int start=10,end=50;
     for(int i=start;i<=end;i++){
        if(prime(i)){
            System.out.println(i);
        }
     }

    }
    static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
     }

    
}

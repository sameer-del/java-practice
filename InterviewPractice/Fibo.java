package InterviewPractice;

public class Fibo {
    public static void main(String[] args) {
        //create without recursion
      /*   int n1 = 0, n2 = 1, n3,i, count = 10;
        System.out.println(n1);
        for ( i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        } */
        int count =10;
        System.out.println(fibo(count));


    }

    public static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int ans = fibo(n-1)+fibo(n-2);
        return ans;
         


    }
}

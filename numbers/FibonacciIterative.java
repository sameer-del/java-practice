public class FibonacciIterative {
    public static void main(String[] args) {
        
        int n = 3; // Find the first 10 Fibonacci numbers
        System.out.println(fibonacci(n));    }

    public static int fibonacci(int n) {
       /*  if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev1 = 1, prev2 = 0;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current; */
        int n3,n1=0,n2=1;
        for(int i=2;i<n;i++){
             n3 = n1+n2;
            n1 =n2;
            n2=n3;

        }
        return n3;
        
    }
}

public class Factorial {
    public static void main(String[] args) {
        int n=5;
       int fact =factorial(n);
    System.out.println(fact);
}
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int ans = n*factorial(n-1);
        return ans;
    }
}

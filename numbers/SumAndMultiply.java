public class SumAndMultiply {
    public static void main(String[] args) {
        int n =234;
        int product = 1;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            product *=rem;
            sum +=rem;
            n=n/10;
        }
        System.out.println(product +" "+sum);
}}

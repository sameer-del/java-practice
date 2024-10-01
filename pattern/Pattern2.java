public class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        
    }
    static void pattern6(int n){
        for(int row=0;row<n*2;row++){
            int total = row>n ? n*2-row : row;
            int spaces = n-total;
            
        }
    }
    static void pattern5(int n){
        for(int row = 0; row < n *2; row++){
            int total =  row>n ? 2* n - row : row;
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n){
        for(int i = 1; i < n; i++){
            for(int j=n;j<i;j--){

            }
        }
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

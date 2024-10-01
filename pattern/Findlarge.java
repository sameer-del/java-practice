public class Findlarge {
    public static void main(String[] args) {
        int[] a = {1,5,7,8,6,9};
       
        System.out.println("largest number: " + findthelargest(a));
        System.out.println("smallest number: " + findtheSmallest(a));

    }
    static int findthelargest(int[] a){
        int max=a[0];
        
        for(int num:a){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    static int findtheSmallest(int[] a){
        int min=a[0];
        
        for(int num:a){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    
}

public class Numberofdigitsineven {
    public static void main(String[] args) {
        int[] arr={22,526,4867,45869,22};
        int ans = evenDigit(arr);
        System.out.println(ans);
        }
    static int evenDigit(int[] nums){
        int even = 0;
        for(int num:nums){
            int count=0;
            while(num>0){
                num =num/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;

    }
}

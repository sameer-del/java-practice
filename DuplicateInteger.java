public class DuplicateInteger {
    public static void main(String[] args) {
        int[] nums= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        System.out.println(nums.toString());
    }
   /*  public static int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i -1]){
                nums[k]=nums[i];
                k++;
            }
        }
        
        return  k;
    } */
}

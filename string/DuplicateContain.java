import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateContain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2,7,8,5,4};
        System.out.println(Duplicate(arr));
    }
    public static boolean Duplicate(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> seen = new ArrayList<Integer>();
        for(int n:nums){
            if(seen.contains(n)){
                list.add(n);
            }else{
                seen.add(n);
            }
        }
        if(list.size() == 0){
            return false;
        }else{
            return true;
        }
    }
}

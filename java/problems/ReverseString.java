import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    public static void main(String[] args) {
        
    }

    public static void reverseString() {
        char[] myName = "Salma".toCharArray();
        char[] reversed = myName;
        for(int i = 0; i<myName.length; i++) {
            reversed[reversed.length-i-1] = myName[i];   
        }
        int[] nums = new int[2];
            Set<Integer> numsSet = new HashSet<Integer>();
            for(int i = 0; i< nums.length; i++) {
                numsSet.add(nums[i]);
            }
    
        System.out.println("Reversed String is: ");
        Utils.printArrayElements(reversed);
    }
}

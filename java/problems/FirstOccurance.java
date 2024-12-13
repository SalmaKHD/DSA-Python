import java.util.HashSet;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        System.out.println();
        System.out.println(findFirstRecurrance(array));
    }
    public static int findFirstRecurrance(int[] array) {
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for(int i = 0; i < array.length; i++) {
                if(hashSet.contains(array[i])) {
                    return array[i];
                } else {
                    hashSet.add(array[i]);
                }
            }
            // no duplicates found
            return -1;
    }
}

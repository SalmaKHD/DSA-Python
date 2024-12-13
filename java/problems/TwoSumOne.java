import java.util.HashMap;

public class TwoSumOne {
    public static void main(String[] args) {
        int[] myArray = {1,5,3,8,9};
        int targetSum1 = 9;
        int targetSum2 = 6;
        System.out.println(findPair(myArray, targetSum1));
        System.out.println(findPair(myArray, targetSum2));
        /* 
        OUPUT (checked):
        {0, 3}
        null
        */
    }

    public static int[] findPair(int[] values, int targetSum) {
        // create hash map 
        HashMap<Integer, Integer> valuesTemp = new HashMap<>();
        for(int i = 0; i< values.length; i++) {
            int pairValue = targetSum - values[i];
            // check if target exists in map
            if(valuesTemp.containsKey(pairValue)){
                // pair found return
                return new int[] {i, valuesTemp.get(pairValue)};
            } else {
                // remember for future reference
                valuesTemp.put(values[i], i);
            }
        }
        return null;
    }


}

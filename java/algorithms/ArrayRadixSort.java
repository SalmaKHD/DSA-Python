package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * sort elements using their digits progressively starting with the least significant digit
 */
public class ArrayRadixSort {
    public static void df(String[] args) {
        // todo: has a little bug, solve
        int[] arrayList = {4,7,3,0,10,1};
        int[] newList = sort(arrayList);
        ArrayUtils.printArrayElements(newList);
        /*
       This list contains:
        0, 1, 3, 4, 7, 10
         */
    }

    /**
     * @precondition: list must contain only positive ints
     * sort an array in descending order using selection sort
     */
    public static int[] sort(int[] arrayList) {
        int[] tempArray = arrayList;
        // find the biggest number in the list
        int biggestElement = arrayList[0];
        for(int i =0; i<arrayList.length; i++) {
            if(arrayList[i] > biggestElement) {
                biggestElement = arrayList[i];
            }
        }

        int exp = 1; // for determining how many times we need to run the outer loop
        HashMap<Integer, ArrayList<Integer>> digitBucket = new HashMap();
        for(int i = 0; i<10; i++) {
            digitBucket.put(i, new ArrayList<>());
        }

        while(biggestElement/exp > 0) {
            for(int i = 0; i<tempArray.length; i++) {
                // move digits to buckets based on current digit value
                ArrayList<Integer> list = digitBucket.get((tempArray[i]/exp)%10);
                list.add(tempArray[i]);
            }
            digitBucket.clear();
            for(int i = 0; i<10; i++) {
                digitBucket.put(i, new ArrayList<>());
            }
            exp *=10;

            int lastIndex = 0;
            for(int j =0; j<digitBucket.size(); j++) {
                ArrayList<Integer> list = digitBucket.get(j);
                Enumeration<Integer> e = Collections.enumeration(list);
                while(e.hasMoreElements()) {
                    tempArray[lastIndex++] = e.nextElement();
                }
            }
        }
        return tempArray;
    }
}
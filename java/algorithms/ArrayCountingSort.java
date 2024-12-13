package algorithms;

import java.util.Arrays;

/**
 * count the number of occurrences of each element and add to a separate array
 * repopulate the array using the index and number of occurrences => occurrences[0] = 2 -> 0,0
 */
public class ArrayCountingSort {
    public static void df(String[] args) {
        // todo: has a little bug, solve
        int[] arrayList = {4,7,3,0,10,1};
        sort(arrayList);
        ArrayUtils.printArrayElements(arrayList);
        /*
       This list contains:
        0, 1, 3, 4, 7, 10
         */
    }

    /**
     * @precondition: list must contain only positive ints
     * sort an array in descending order using selection sort
     */
    public static void sort(int[] arrayList) {
        // find the biggest number in the list
        int biggestElement = arrayList[0];
        for(int i =0; i<arrayList.length; i++) {
            if(arrayList[i] > biggestElement) {
                biggestElement = arrayList[i];
            }
        }
        // create an array for holing number of occurrences of each element
        int[] numberOfOccurences = new int[biggestElement+1];
        Arrays.fill(numberOfOccurences, 0);
        for(int i = 0; i<arrayList.length; i++) {
            numberOfOccurences[arrayList[i]]++;
        }
        int lastFilledIndex = 0;
        for(int i = 0; i < numberOfOccurences.length; i++) {
            for(int j = 0; j < numberOfOccurences[i]; j++) {
                arrayList[lastFilledIndex++] = i;
            }
        }
    }
}


package algorithms;

/**
 * pick the smallest element in each iteration and move to the right position
 */
public class ArraysSelectionSort {
    public static void main(String[] args) {
        int[] arrayList = {0,1,3,4,5,6,-1,-10};
        int[] sortedArray = sort(arrayList);
        ArrayUtils.printArrayElements(sortedArray);
        /*
       This list contains:
       6, 5, 4, 3, 1, 0, -1, -10
         */
    }

    /**
     * sort an array in descending order using selection sort
     */
    public static int[] sort(int[] arrayList) {
        int[] tempArray = arrayList;
        for(int i = 0; i<tempArray.length; i++) {
            int smallestValueIndex = i;
            for(int j = i; j<tempArray.length; j++) {
                if(tempArray[j] < tempArray[smallestValueIndex]) {
                    smallestValueIndex = j;
                }
            }
            // swap elements
            int valueTemp = tempArray[i];
            tempArray[i] = tempArray[smallestValueIndex];
            tempArray[smallestValueIndex] = valueTemp;
        }
        return tempArray;
    }
}

package algorithms;

/**
 * keep the first part of the list sorted and insert each element into the right position in each iteration
 */
public class ArraysInsertionSort {
    public static void main(String[] args) {
        int[] arrayList = {0,1,3,4,5,6,-1,-10};
        int[] sortedArray = sort(arrayList);
        ArrayUtils.printArrayElements(sortedArray);
        /*
       This list contains:
        -10, -1, 0, 1, 3, 4, 5, 6
         */
    }

    /**
     * sort an array in descending order using selection sort
     */
    public static int[] sort(int[] arrayList) {
        int[] tempArray = arrayList;
        for(int i =0; i<arrayList.length; i++) {
            int currentElement = tempArray[i];
            int insertIndex = i;
            for(int j = i-1; j >= 0 ; j--) {
                if(tempArray[j] > currentElement) {
                    continue;
                } else {
                    tempArray[j+1] = tempArray[j];
                    insertIndex = j;
                }
            }
            tempArray[insertIndex] = currentElement;
        }
        return tempArray;
    }
}

package algorithms;

/**
 * search through the array one by one, if found return true or 1
 */
public class ArrayBinarySearch {
    public static void df(String[] args) {
        int[] arrayList = {4,7,3,0,10,1};
        int value = 5;
        System.out.println("value 5 is present in the array:" + search(arrayList, value));
        /*

         */
    }

    /**
     * @precondition: list must contain only positive ints
     * sort an array in descending order using selection sort
     */
    public static int search(int[] arrayList, int searchedValue) {
        int mid = arrayList.length/2;
        if(arrayList[mid] == searchedValue) return mid
        else if (arrayList.length == 1) return -1
        int[] tempArray = new int[mid];
        if(arrayList[mid] > searchedValue)
            // pick right half
            System.arraycopy(arrayList, 0, tempArray, 0, mid);
        else System.arraycopy(arrayList, mid, tempArray, 0, mid);
        search(tempArray, searchedValue);
    }
}

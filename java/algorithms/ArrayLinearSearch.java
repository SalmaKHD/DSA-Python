package algorithms;

/**
 * search through the array one by one, if found return true or 1
 */
public class ArrayLinearSearch {
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
    public static boolean search(int[] arrayList, int searchedValue) {
        boolean valueFound = false;
        for(int i = 0; i<arrayList.length; i++) {
            if (arrayList[i] == searchedValue) {
                return true;
            }
        }
        return false;

    }
}

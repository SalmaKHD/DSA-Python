package algorithms;

/**
 * lower values -> left side of the pivot, higher values -> right side of the pivot
 *
 * last value chosen as the pivot
 */
public class ArraysQuickSort {
    public static void main(String[] args) {
        // todo: has a little bug, solve
        int[] arrayList = {0,1,3,4,5,6};
        sort(arrayList, 0, arrayList.length-1);
        ArrayUtils.printArrayElements(arrayList);
        /*
       This list contains:
        -10, -1, 0, 1, 3, 4, 5, 6
         */
    }

    /**
     * sort an array in descending order using selection sort
     */
    public static void sort(int[] arrayList, int subArrayStartIndex, int subArrayEndIndex) {
        if(subArrayStartIndex < subArrayEndIndex) {
            int pi = partition(arrayList, subArrayStartIndex, subArrayEndIndex);
            sort(arrayList, subArrayStartIndex, pi-1);
            sort(arrayList, pi+1, subArrayEndIndex);
        }
    }

    public static int partition(int[] arrayList, int subArrayStartIndex, int subArrayEndIndex) {
        // choose last element as the pivot
        int pivot = arrayList[subArrayEndIndex];
        // represents index of smaller element
        int i = (subArrayEndIndex-1);

        for(int j = subArrayStartIndex; j<=subArrayEndIndex; j++) {
            if(arrayList[j] < pivot) {
                i++;
                int temp = arrayList[i];
                arrayList[i] = arrayList[j];
                arrayList[j] = temp;
            }
        }
        int temp = arrayList[i+1];
        arrayList[i+1] = arrayList[subArrayEndIndex];
        arrayList[subArrayEndIndex] = temp;
        return (i+1);
    }
}

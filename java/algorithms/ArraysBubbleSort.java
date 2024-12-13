package algorithms;

public class ArraysBubbleSort {
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
     * sorts in descending order
     */
    public static int[] sort(int[] arrayList) {
        int[] arrayListTemp = arrayList;
        for(int i = 0; i<arrayList.length-1; i++) {
            for(int j = 0; j < arrayList.length-1; j++) {
                if(arrayList[j] > arrayList[j+1]) {
                    // swap
                    int tempValue = arrayList[j];
                    arrayListTemp[j] = arrayListTemp[j+1];
                    arrayListTemp[j+1] = tempValue;
                }
            }
        }
        return arrayListTemp;
    }
}

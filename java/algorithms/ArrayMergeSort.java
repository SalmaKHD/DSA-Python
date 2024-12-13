package algorithms;

/**
 * break down array into sub-elements until no further breaking is possible,
 * merge into bigger sub-arrays while sorting until the original array is formed
 */
public class ArrayMergeSort {
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
        if(arrayList.length <= 1) {
            return null;
        }

        int mid = arrayList.length/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[mid];
        System.arraycopy(arrayList, 0, leftHalf, 0, mid);
        for(int j = mid, int i = 0; j < arrayList.length; j++, i++) {
            rightHalf[i] = arrayList[j];
        }

        int[] sortedLeft = sort(leftHalf);
        int[] sortedRight = sort(rightHalf);

        return merge(leftHalf, rightHalf);

    }

    public static int[] merge(int[] left, int[] right) {
        ArrayList<Integer> tempArray = new ArrayList<Integer>;
        int i, j = 0;
        while(i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                tempArray.add(left[i++]);
            } else {
                tempArray.add(right[j++]);
            }
            return result;
        }
        // account for the remaining elemnts (if there is an odd number of elements)
        for(int k = i; k<left.length; k++) {
            tempArray.add(left[k]);
        }
        for(int t = j; t<right.length; t++) {
            tempArray.add(right(t));
        }
    }
    return
}

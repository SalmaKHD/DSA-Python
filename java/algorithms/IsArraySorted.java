package org.example.recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] myArray = {2,3,54,5,6,7};
        System.out.println("This array is sorted: " + isArraySorted(myArray, myArray.length));
    }
    public static int isArraySorted(int[] array, int index) {
        if(array.length == 1) {
            return 1;
        }
        return array[index] < array[index-2] ? 0 : isArraySorted(array, index-1);
    }
}


public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int[] myArray = {12, 13, 19, 25, 30, 99};
        int value = 84;
        int value2 = 13;
        int value3 = 99;
        boolean isValueInList = binarySearch(myArray, value) != -1;
        boolean isValue2InList = binarySearch(myArray, value2) != -1;
        boolean isValue3InList = binarySearch(myArray, value3) != -1;
        boolean isValu3InList = recursiveBinarySearch(0, myArray.length-1, value3, myArray) != -1;
        System.out.println("99 is in this list (using recursive method): " + isValu3InList);
        System.out.println("84 is in this list: " + isValueInList);
        System.out.println("13 is in this list: " + isValue2InList);
        System.out.println("99 is in this list: " + isValue3InList);
    /*
    OUTPUT:
    99 is in this list (using recursive method): true
    84 is in this list: false
    13 is in this list: true
    99 is in this list: true
    */
    }
    /*
    How it works: calculate the mid value in the list, compare to
    the intended value, if greater->move l to mid+1 (search the second half)
    if smaller -> move h to mid-1 (search the first half)
    do as long as l is less than or equal to h
    if l becomes greater -> value not found, abort
    */
    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length-1;
        int mid = (low+high)/2;
        while(low <= high) { // low > high != true -> we want to do an additional step for checking equal h and l
            if(array[mid] == value) return mid;
            if(value > array[mid]) low = mid+1;
            else high = mid-1;
            mid=(low+high)/2;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int low, int high, int value, int[] myArray) {
        if(low==high) {
            if(myArray[low] == value) return low;
            else return -1;
        } else {
            int mid = (low+high)/2;
            if(value == myArray[mid]) return mid;
            else if(value > myArray[mid]) 
            return recursiveBinarySearch(mid+1, high, value, myArray);
            else 
            return recursiveBinarySearch(low, mid-1, value, myArray);
        }
    }
}

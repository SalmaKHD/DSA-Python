package algorithms;

/**
 * used to find the min member of an array (uses a brute force approach)
 */
public class ArraysMinMember {
    public static void main(String[] args) {
        int[] arrayList = {0,1,3,4,5,6,-1,-10};
        int minValue = findMinValue(arrayList);
        System.out.println("The min value found is: " + minValue);
        /*
        OUTPUT:
        The min value found is: -10
         */
    }
    public static int findMinValue(int[] arrayList) {
        int lowestValueSoFar = arrayList[0];
        for(int i = 0; i<arrayList.length; i++) {
            if(arrayList[i] < lowestValueSoFar) {
                lowestValueSoFar = arrayList[i];
            }
        }
        return lowestValueSoFar;
    }
}

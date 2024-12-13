/*
    Lists must be sorted!
*/

public class TwoWayMergeSort{
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 9};
        int[] b = {4,7,9,9};
        int[] c = merge(a, b, a.length, b.length);
        System.out.println("c is:" );
        Utils.printArrayElements(c);
    }
    /*
    OUTPUT:
    c is:
    1, 4, 4, 7, 7, 9, 9, 9
    */

    public static int[] merge(int[] a, int[] b, int n,int m) {
        int[] sortedArray = new int[n+m];
        int i = 0 ,k = 0,j = 0;
        while(i < n && k< m) {
            if(a[i] < b[k]) {
                sortedArray[j++] = a[i++];
            } else {
                sortedArray[j++] = b[k++];
            }
        }
        for(int t = i; t<n; t++ ) {
            sortedArray[j++] = a[t];
        }
        for(int t = k; t< m; t++)  {
            sortedArray[j++] = b[t];
        }
        return sortedArray;
    }
}
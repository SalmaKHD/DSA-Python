public class MergeSort {

    public static void main(String[] args) {
            int[] myArray = {1, 5, 7, 8, 11, 2, 9};
            mergeSort(myArray, 0, myArray.length-1);
            Utils.printArrayElements(myArray);
    }
    

    public static void mergeSort(int[] array, int low, int high) {
        if(low < high) {
            int mid = (low+high)/2;
            mergeSort(array, low, mid);
            mergeSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
       int n1 = mid - low + 1;
       int n2 = high - mid;

       int[] L = new int[n1];
       int[] R = new int[n2];
        for(int i =0; i<n1; i++) {
            L[i] = array[low + i];
        }
        for(int i = 0; i < n2; i++ ) {
            R[i] = array[mid+1+i];
        }

        int i = 0; int j = 0; int k = 0;
        while(i<=n1 &&j<= n2){
            if(R[i] >=L[j]) {
                array[k++] = L[i++];
            }
            else {
                array[k++] = R[j++];
            }
        }
        // copy remaining elements
        while(i < n1) {
            array[k++] = R[i++];
        
        }

        while(j <= n2) {
            array[j++] = array[k++];
        }
    }
}

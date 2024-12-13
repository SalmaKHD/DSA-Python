public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {1,4,6,2,9,20,19};
        quickSort(myArray, 0, myArray.length-1);
        // Utils.printArrayElements(myArray);
    }
    
    public static void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int j = partition(array, low, high);
            quickSort(array, low, j);
            quickSort(array, j+1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivotIndex= (low+high)/2;    
        int pivot = array[pivotIndex];

            int i= low; int j = high;
            while (i < j) {
            do {
                i++;
            } while(array[i] <= pivot);

            do {
                j--;
            } while(array[j] > pivot);
            if ( i< j) {
                swap(array, i, j);
            }
            swap(array, low, j);
        }
        return pivotIndex;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

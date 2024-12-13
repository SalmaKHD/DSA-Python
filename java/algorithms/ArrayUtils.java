package algorithms;

public class ArrayUtils {
    public static void printArrayElements(int[] arrayList) {
        System.out.println("This list contains: ");
        for(int i = 0; i<arrayList.length; i++) {
            String delimiter = i != arrayList.length-1 ? ", " : "";
            System.out.print(arrayList[i] + delimiter);
        }
    }
}

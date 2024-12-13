public class Utils {
    public static <T> void printArrayElements(char[] reversed) {
        for(int i = 0; i< reversed.length; i++) {
        System.out.print(reversed[i]);
        if(i != reversed.length-1) {
            System.out.print(", ");
        }
        }
        System.out.println();
    }
}

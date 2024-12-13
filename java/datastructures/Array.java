import java.util.List;

public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // how to instantiate arrays in java
        // ALL SET TO 0 BY DEFAULT
    int[] myArray = {1,2,3,4};
    int[] myArray2 = new int[3];
    myArray[1] = 1;
    
    // accessing elements
    for(int i=0; i<myArray.length; i++) {
        System.out.println(myArray[i]);
    }

    // multidimentioal arrays 
    int[][] myMultiArray = new int[3][1];
    myMultiArray[0][0] = 2;
    myMultiArray[1][0] = 3;
    // or
    int[][]  myMultiArray2 = {{1,2}, {2,3}};
    // traversal
    for(int i=0; i<myMultiArray.length; i++) {
        for(int j=0; j<myMultiArray[i].length; i++) {
            System.out.println("current element is " + myMultiArray[i][j]);
        }
    }
    }
}

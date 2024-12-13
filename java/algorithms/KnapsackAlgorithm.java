public class KnapsackAlgorithm {
    public static void main(String[] args) {
        int n = 16;
        int w = 20;
        int[] values = { 10, 5, 30, 8, 12, 30, 50, 10, 2, 10, 40, 80, 100, 25, 10, 5 };
        int[] weights = { 1, 4, 6, 2, 5, 10, 8, 3, 9, 1, 4, 2, 5, 8, 9, 1 };
        KnapsackAlgorithm algoritm = new KnapsackAlgorithm(n, w, weights, values);
        System.out.println("The final result is: " + algoritm.findKnapsackSolution());
    }

    int n;
    int w;
    int[] capacities;
    int[] values;

    public KnapsackAlgorithm(int n, int w, int[] values, int[] capacities) {
        this.n = n;
        this.w = w;
        this.values = values;
        this.capacities = capacities;
    }

    // populate the array with 0 values
    public int[][] findKnapsackSolution() {
        // used to store solution values in an array
        int[][] mat = new int[n + 1][w + 1];
        // populate the array with 0 values
        for (int r = 0; r < w + 1; r++) {
            mat[0][r] = 0;

        }
        for (int c = 0; c < n + 1; c++) {
            mat[c][0] = 0;
        }

        // iterate through items
        for (int item = 1; item <= n; item++) {
            // iterate through capacities
            for (int capacity = 1; capacity <= w; capacity++) {
                // calculate the max value without the current item
                int maxValWithoutCurr = mat[item - 1][capacity];
                int maxValWithCurr = 0;
                // calcuate the max weight with the current item
                int weightOfCurr = capacities[item - 1];
                // check if we have exceeded the capacity
                if (capacity >= weightOfCurr) {
                    maxValWithCurr = values[item - 1];

                    int remainingCapacity = capacity - weightOfCurr;
                    maxValWithCurr += mat[item - 1][remainingCapacity];
                }
                // store the largest possibe weight with these values
                mat[item][capacity] = Math.max(maxValWithCurr, maxValWithCurr);
            }
        }
        // return the result array
        return mat;
    }
}
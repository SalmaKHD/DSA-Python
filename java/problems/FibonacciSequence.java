import java.util.HashMap;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("3rd number is" + fibonacciIterative(2));
        System.out.println("4th number is" + fibonacciIterative(3));
        System.out.println("100th number is" + fibonacciIterative(99));
    }

    // returns the nth number in the fibonacci sequence
    public static int fibonacciIterative(int n) {
        if(n==0)return 0;
        int index  = 0;
        int currentNumber = 1;
        // int previousNumber = 0;
        // int nextNumber = 0;
        // while(index <= n) {
        //     currentNumber = current;
        //     previousNumber = currentNumber;
        //     index++;
        // }
        return currentNumber;
    }

    public static int fibonacciRecursive(int n) {
        if(n < 2) {
            return n;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static int fibonacciDynamicProgramming(int n) {
        if(cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if(n<2) {
                return n;
            } else {
                cache.put(n, fibonacciDynamicProgramming(n-1)+fibonacciDynamicProgramming(n-2));
                return cache.get(n);
            }
        }
    }
}

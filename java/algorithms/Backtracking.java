package org.example.backtracking;

public class Backtracking {
    public static void main(String[] args) {
           binary(1);
    }

    public static char[] array = {'s','a','l','m','a'};
    // find strings of n size
    public static void binary(int n) {
        if(n<1){
            System.out.println(array);
        } else {
            array[n-1] = 0;
            binary(n-1);
            array[n-1] = 1;
            binary(n);
        }
    }
}

package org.example.recursion;

public class TowersOfHanoi {
    public void towersOfHanoi(int n, char fromPeg, char topeg, char auxpeg) {
        // make the move and return
        if(n==1) {
            System.out.println("Move disk 1 from peg " + fromPeg + "to peg" + topeg);
            return;
        }

        // move top n-1 disks from A to B, using C
        towersOfHanoi(n-1, fromPeg, auxpeg, topeg);
        System.out.println("Move disk from " + fromPeg + "to peg" + topeg);
        // move top n-1 disks from B to C using A
        towersOfHanoi(n-1, auxpeg, topeg, fromPeg);

    }
}

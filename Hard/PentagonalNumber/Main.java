package Hard.PentagonalNumber;

import java.util.*;
import java.io.*;

class Main {

    public static int PentagonalNumber(int num) {
        // code goes here

        return (((num - 1) * 5 * num) / 2) + 1;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PentagonalNumber(s.nextLine()));
    }

}

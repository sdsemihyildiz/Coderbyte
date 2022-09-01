import java.util.*;
import java.io.*;

class Main {

    public static int LargestPair(int num) {
        // code goes here

        int largest = Integer.MIN_VALUE;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length() - 1; i++) {
            int first = Integer.parseInt(String.valueOf(str.charAt(i)));
            int second = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
            int pair = first * 10 + second;
            if (pair > largest) {
                largest = pair;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LargestPair(s.nextLine()));
    }

}
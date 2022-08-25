package Easy.BitWiseOne;

import java.util.*;
import java.io.*;

class Main {

    public static String BitwiseOne(String[] strArr) {
        // code goes here
        String s1 = strArr[0];
        String s2 = strArr[1];
        String res = "";

        for (int i = 0; i < strArr[0].length(); i++) {
            if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                res += "1";
            } else {
                res += "0";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BitwiseOne(s.nextLine()));
    }

}

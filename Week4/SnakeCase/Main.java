package Week4.SnakeCase;

import java.util.*;

class Main {

    public static String SnakeCase(String str) {
        return str.toLowerCase().replaceAll("([^a-z])", " ")
                .replaceAll(" +", "_").trim();
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase(s.nextLine()));

    }

}

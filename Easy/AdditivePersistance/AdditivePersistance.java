package Easy.AdditivePersistance;

import java.util.*;

class Main {
    public static int AdditivePersistence(int number) {
        int result = 0;
        int count = 0;

        if (number > 9) {
            count++;

            while (number > 0) {
                number /= 10;
            }

            return AdditivePersistence(result);
        } else {
            return count;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = Integer.valueOf(scn.nextLine()).intValue();
        System.out.println(AdditivePersistence(number));
        scn.close();
    }
}

import java.util.*;
import java.io.*;

class Main {

    public static int HistogramArea(int[] arr) {
        // code goes here
        int max = 0;
        int x = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while (x <= arr.length) {
            int no = x == arr.length ? 0 : arr[x];
            if (stack.isEmpty() || no >= arr[stack.peek()]) {
                stack.push(x);
                x++;
            } else {
                int height = arr[stack.pop()];
                int width = stack.isEmpty() ? x : x - 1 - stack.peek();
                max = Math.max(max, height * width);
            }

        }

        return max;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(HistogramArea(s.nextLine()));
    }

}
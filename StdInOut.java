/**
 * Task
 * In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a
 * portion of the code is provided for you in the editor below.
 *
 * Input Format
 * There are  lines of input, and each line contains a single integer.
 *
 * Sample Input
 * 4
 * 10
 * 125
 *
 * Sample Output
 * 4
 * 10
 * 125
 *
 */

import java.util.*;

public class StdInOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            System.out.println(num);
        }
        scan.close();
    }
}


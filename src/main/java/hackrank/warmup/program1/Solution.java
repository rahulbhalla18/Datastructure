package hackrank.warmup.program1;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        if (n > 1) {
            ar = sortCollection(n, ar);
            for(int a : ar){
                System.out.print(a + ", ");
            }
            System.out.println("");
            int numberOfPair = 0;
            for (int index = 1; index < n; ) {
                if (ar[index] == ar[index - 1]) {
                    index += 2;
                    numberOfPair++;

                } else
                    index += 1;
            }
            return numberOfPair;
        }

        return 0;

    }

    static int[] sortCollection(int n, int[] ar) {

        for (int difference = n / 2; difference > 0; ) {

            for (int nextPoint = difference; nextPoint < n; nextPoint++) {

                int alignElement = ar[nextPoint];
                int startpoint = nextPoint;

                for (; startpoint >= difference && alignElement< ar[startpoint - difference]; startpoint -= difference) {
                        ar[startpoint] = ar[startpoint - difference];
                }
                ar[startpoint] = alignElement;

            }

            difference = difference / 2;
        }
        return ar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(System.out));//getenv("OUTPUT_PATH")));
        System.out.println("Enter number");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));
        //   bufferedWriter.newLine();

        //  bufferedWriter.close();

        scanner.close();
    }
}

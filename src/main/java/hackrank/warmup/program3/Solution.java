package hackrank.warmup.program3;

import java.io.IOException;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result =jumpingOnClouds(c);

        System.out.println(String.valueOf(result));

        scanner.close();
    }

   private static int jumpingOnClouds(int[] c) {

        int minSteps = 0;
        for(int count=0; count < c.length-1;  ){
         count = (count+2) < c.length && c[count+2] == 0 ? count +2 : count +1 ;
         minSteps++;
        }
        return minSteps;
    }
}

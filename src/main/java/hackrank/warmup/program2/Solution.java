package hackrank.warmup.program2;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int countingValley = 0;
        int belowSea = 0;
        for(int index = 0 ; index < n; index++){
            char character = s.charAt(index);
            if(character == 'D'){
                if(belowSea ==0){
                    countingValley++;
                }
                belowSea --;
            }else
                belowSea++;
        }


return countingValley;

//UDDDUDUU
        //1 0 -1 -2 -1 -2 -1 0
        //U D D  D   U D  U U
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}


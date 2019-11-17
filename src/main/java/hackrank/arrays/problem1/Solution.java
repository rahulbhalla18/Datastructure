package hackrank.arrays.problem1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxsum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int row = 0; row < 4; row++) {
            currentSum = 0;
            for (int column = 0; column < 4; column++) {
                currentSum = arr[row][column] + arr[row][column + 1] + arr[row][column + 2];
                currentSum = currentSum + arr[row + 1][column + 1];
                currentSum = currentSum + arr[row + 2][column] + arr[row + 2][column + 1] + arr[row + 2][column + 2];

                if (maxsum < currentSum)
                    maxsum = currentSum;
            }
        }

        return maxsum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
/*
        for (int i = 0; i < 6; i++) {
            System.out.println("enter line");
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/
        scanner.close();

        int result = hourglassSum(arr);

        System.out.println(result);


    }

}

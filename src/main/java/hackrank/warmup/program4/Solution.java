package hackrank.warmup.program4;

import java.io.IOException;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        String cItems = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        long result =repeatedString(cItems, n);

        System.out.println(String.valueOf(result));

        scanner.close();
    }

   private static long repeatedString(String s, long n) {
    long result=0;

    long aOccuredInshort = findOccurance(s);

    long multipler = n / s.length();
    long substringSize = n % s.length();
       aOccuredInshort = aOccuredInshort * multipler;
        aOccuredInshort = aOccuredInshort + findOccurance(s.substring(0,(int)substringSize));




    return aOccuredInshort;

   }

    private static long findOccurance(String s){
        String withouta = s.replaceAll("a","");
        return (s.length() - withouta.length());

    }
}

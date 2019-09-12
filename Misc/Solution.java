package Misc;

import java.util.*;
import java.io.*;

public class Solution {
    static void getMaxPairwiseProduct(int[] numbers) {
        //int max_product = 0;
        int n = numbers.length;

//        for (int first = 0; first < n; ++first) {
//            for (int second = first + 1; second < n; ++second) {
//                max_product = max(max_product,
//                    numbers[first] * numbers[second])
//            }
//        }

        int max=numbers[0];
        int max_2=Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            int number=numbers[i];
            if (number>max)
            {
                max_2=max;
                max=number;
            }
            else if(number> max_2 && number!=max)
                max_2=number;


        }
        System.out.println(max*max_2);
    }

    public static void main(String[] args) {
//        FastScanner scanner = new FastScanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextInt();
//        }
        //getMaxPairwiseProduct(numbers);


        char a='5';
        long b=Character.getNumericValue(a);
        System.out.print(b);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
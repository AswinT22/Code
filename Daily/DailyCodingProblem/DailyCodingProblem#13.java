package Daily.DailyCodingProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

class LongestSubstringWithKDistinctCharacters {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    private static long findLengthOfSubstring(String s, int k) {

//        Hashtable<Character,Integer> table=new Hashtable<>();
        int[] charArray = new int[26];
        int uniqueChars = 0;


        for (int i = 0; i < k; i++) {
            char current = s.charAt(i);
            if (charArray[current - 'a'] == 0) {
                ++uniqueChars;
            }
            ++charArray[current - 'a'];

        }
        int max_length = -1;

        int start = 0;
        int i = k;
        for (; i < s.length(); i++) {

            if (uniqueChars == k) {
                int currentLength = i - start;
                if (max_length < currentLength)
                    max_length = currentLength;


            }

            if (uniqueChars > k) {

                while (uniqueChars > k && start < i) {

                    char temp = s.charAt(start);
                    --charArray[temp - 'a'];

                    if (charArray[temp - 'a'] == 0)
                        --uniqueChars;

                    ++start;
                }
            }
            char current = s.charAt(i);
            if (charArray[current - 'a'] == 0) {
                ++uniqueChars;
            }
            ++charArray[current - 'a'];

        }
        if (uniqueChars == k) {
            int currentLength = i - start;
            if (max_length < currentLength)
                max_length = currentLength;


        }

        return max_length;

    }

    public static void main(String[] args) {
        //code

        FastReader sc = new FastReader();

        int testCases = sc.nextInt();

        while (testCases-- > 0) {


            String s = sc.next();
            int k = sc.nextInt();


            System.out.println(findLengthOfSubstring(s,k));

        }


    }

}
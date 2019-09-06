package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/reversing-the-vowels/0/?ref=self


import java.util.*;
import java.lang.*;
import java.io.*;

public class ReversingTheVowels {


    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }


    }

        public  static boolean isVowel(char c){


            switch (c) {

                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                        return true;
            }

            return false;

        }

        public static void main (String[] args) {
            //code

            FastReader sc=new FastReader();

            int testCases=Integer.parseInt(sc.nextLine());

            while (testCases-- > 0){



                StringBuilder st=new StringBuilder(sc.nextLine());

                int len=st.length();

                int i=0,j=len-1;


                while (i<j){

                    try {
                        while (!isVowel(st.charAt(i)))
                            ++i;

                        while (!isVowel(st.charAt(j)))
                            --j;

                        if(i<j) {
                            char temp = st.charAt(i);
                            st.setCharAt(i, st.charAt(j));
                            st.setCharAt(j, temp);
                        }
                        ++i;
                        --j;
                    }
                    catch (IndexOutOfBoundsException e){

                        break;
                    }







                }

                System.out.println(st);





            }


        }
    }
package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/reverse-an-array/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseAnArray {

    static class  FastReader{

        StringTokenizer st;
        BufferedReader br;


        FastReader(){

            br=new BufferedReader(new InputStreamReader(System.in));


        }

        String next(){
            while (st==null||!st.hasMoreTokens()) {
                try {


                    st = new StringTokenizer(br.readLine());

                } catch (Exception ex) {

                    ex.printStackTrace();

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




    }


    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int[] array=new int[n];

            for (int i = 0; i <n ; i++)

                array[i]=sc.nextInt();

            StringBuilder sb=new StringBuilder();
            for (int i = n-1; i >-1 ; i--)
                sb.append(array[i]+" ");



            System.out.println(sb.toString().trim());




        }


    }
}
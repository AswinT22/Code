package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=sp-arrays-and-searching&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

public class ChocolateDistributionProblem {

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
            long[] arr=new long[n];
            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextLong();


            int students=sc.nextInt();

            Arrays.sort(arr);


            long minDiff=arr[n-1]-arr[0];

            for (int i = 0; i <=n-students ; i++) {

                long temp=arr[i+students-1]-arr[i];

                if(minDiff>temp)
                    minDiff=temp;

            }

            System.out.println(minDiff);




        }


    }
}
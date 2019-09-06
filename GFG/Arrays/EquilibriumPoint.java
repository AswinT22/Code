package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/equilibrium-point/0/?track=sp-arrays-and-searching&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

public class EquilibriumPoint {

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

    private static int equilibriumPoint(int[] arr,int n ){

        long rightSum=0;
        for (int i = 0; i < n; i++)
            rightSum+=arr[i];

        long leftsum=0;
        for (int i = 0; i < n; i++) {

        rightSum-=arr[i];


        if(rightSum==leftsum)
            return i+1;

        leftsum+=arr[i];


        }

        return -1;

    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){

            int n=sc.nextInt();

            int[] arr=new int[n];

            for (int i = 0; i < n; i++)
                arr[i]=sc.nextInt();

            System.out.println(equilibriumPoint(arr,n));


        }


    }
}
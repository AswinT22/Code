package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/absolute-difference-1/0/?ref=self`

import java.util.*;
import java.lang.*;
import java.io.*;

public class AbsoluteDifferenceOf1{

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

   private static String findAbsOfOneLessThanK(long[] arr,int n,long k){

        StringBuilder sb=new StringBuilder();
       for (int i = 0; i <n ; i++) {

           if(arr[i]<k && arr[i]>9 && isAbsOfOne(arr[i]))
               sb.append(arr[i]).append(" ");
       }


       return sb.toString().trim();

   }
    private static boolean isAbsOfOne(long num){



        while (num>0){

            long rem=num%10;

            num/=10;

            if(num!=0){
            long rem2=num%10;

            if(Math.abs(rem-rem2)!=1)
                return false;

            }

        }

        return true;

    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();
            long k =sc.nextInt();
            long[] arr=new long[n];

            for (int i = 0; i < n; i++)
                arr[i]=sc.nextLong();

            String res=findAbsOfOneLessThanK(arr,n,k);

            if(res.isEmpty())
                System.out.println("-1");
            else
                System.out.println(res);

        }


    }
}
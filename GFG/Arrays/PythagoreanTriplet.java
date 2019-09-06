package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/pythagorean-triplet/0/?track=sp-arrays-and-searching&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

public class PythagoreanTriplet {

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

    private static  boolean isATripletPresent(int[] arr,int n){


        for (int i = 0; i < n-2; i++)
            for (int j = i+1; j <n-1 ; j++)
                for (int k = j+1; k <n ; k++)
                    if(arr[i]+arr[j]==arr[k])
                        return true;





        return false;




    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int[] arr=new int[n];
            for (int i = 0; i <n ; i++){
                arr[i]=sc.nextInt();
                arr[i]*=arr[i];

            }




            Arrays.sort(arr);

            if(isATripletPresent(arr,n))
                System.out.println("Yes");
            else
                System.out.println("No");





        }


    }
}
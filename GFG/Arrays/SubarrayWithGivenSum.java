package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarrayWithGivenSum  {

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


    private static String subarrayWithGivenSumK(int[] arr,int n,int k){


        int startIndex=0;


        for (int i = 0; i < n; i++) {
            int currentSum=arr[i];

            if(startIndex>0)
                currentSum=arr[i]-arr[startIndex-1];

            if(currentSum<k)
                continue;

            while (currentSum>k && startIndex<i){
                ++startIndex;
                currentSum=arr[i]-arr[startIndex-1];


            }



            if(currentSum==k)

                return (startIndex+1)+" "+(i+1);











        }

        return "-1";

    }
    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();
            int k=sc.nextInt();


            int[] arr=new int[n];
            arr[0]=sc.nextInt();
            for (int i = 1; i <n ; i++)
                arr[i]=sc.nextInt()+arr[i-1];


            System.out.println(subarrayWithGivenSumK(arr,n,k));





        }


    }
}
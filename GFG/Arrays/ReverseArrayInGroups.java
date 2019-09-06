package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseArrayInGroups {

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

    static StringBuilder reverse(long[] arr,int startIndex,int endIndex){

        StringBuilder sb=new StringBuilder();

        for (int i = endIndex-1; i >=startIndex ; i--)
            sb.append(arr[i]).append(" ");

        return sb;

    }

    static void reverseInGroups(long[] arr,int n,int k){


        StringBuilder sb=new StringBuilder();

        int startIndex=0;
        int endIndex=k;
        while (startIndex<n){


            if(endIndex>n)
                endIndex=n;

            sb.append(reverse(arr,startIndex,endIndex));

            startIndex+=k;
            endIndex+=k;
        }
        System.out.println(sb.toString().trim());


    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();
            int k=sc.nextInt();


            long[] arr=new long[n];

            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextLong();


            reverseInGroups(arr,n,k);


        }


    }
}
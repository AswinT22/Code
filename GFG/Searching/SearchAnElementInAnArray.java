package GFG.Searching;
//https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array/0/?track=sp-arrays-and-searching&batchId=152


import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchAnElementInAnArray {

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

            int[] arr=new int[n];

            for (int i = 0; i < n; i++)
                arr[i]=sc.nextInt();


            int k=sc.nextInt();

            int found=-1;

            for (int i = 0; i <n ; i++) {

                if(arr[i]==k)
                {
                    found=i;
                    break;
                }

            }

            System.out.println(found);




        }


    }
}
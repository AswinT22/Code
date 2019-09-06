package GFG.Searching;
//https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class FloorInASortedArray {

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

    public static  int floorOfArray(long[] A,long k,int l,int r) {

        if (r>=l)
        {
        int mid = l + (r - l) / 2;

        if (A[mid] == k)
            return mid;


        if (A[mid] > k)
            return floorOfArray(A, k, l, mid-1);

        else {


            for (int i = mid; i < r; i++) {

                if (A[i] == k)
                    return i;
                else if (A[i] > k)
                    return i - 1;


            }

            return r-1;
        }
    }

        return -1;
    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();
            long  k=  sc.nextLong();

            long[] A=new long[n];

            for (int i = 0; i < n; i++)
                A[i]=sc.nextLong();

            System.out.println(floorOfArray(A,k,0,n-1));


        }


    }
}
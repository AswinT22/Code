package GFG.Searching;

//https://practice.geeksforgeeks.org/problems/number-of-occurrence/0/?track=sp-arrays-and-searching&batchId=152

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfOccurrence{
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
    public static void main(String[] args)
    {
      FastReader sc = new FastReader();
        long T = sc.nextLong();
        while(T>0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long key =sc.nextLong();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }



            System.out.println(bin_search(arr,0,n-1,key));
            T--;
        }
    }


    static String bin_search(long[] A, int left, int right, long k)
    {
        // Your code here

        if(right>=left) {

            int mid = left +(right - left) / 2;

            if (A[mid] == k) {

                int startIndex=mid;
                int endIndex=mid;
                int count=1;
                while (startIndex>0){

                    if(A[--startIndex]!=k){
                        ++startIndex;
                        break;
                    }

                    ++count;
                }

                while (endIndex<A.length-1){

                    if(A[++endIndex]!=k){
                        --endIndex;
                        break;
                    }

                    ++count;
                }


                return String.valueOf(count);
            }

            if (A[mid] > k)
                return bin_search(A, left, mid-1, k);


            if (A[mid] < k)
                return bin_search(A, mid + 1, right, k);

        }



        return "-1";

    }
}
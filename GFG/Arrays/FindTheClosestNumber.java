package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/find-the-closest-number/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindTheClosestNumber {

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

    private static int closestNumber(int[] arr,int startIndex,int endIndex,int k ){
        int mid=startIndex+((endIndex-startIndex)/2);
       // int midEleme=arr[mid];
        if(arr[mid]==k || endIndex-startIndex<2||mid==0||mid==arr.length-1)
            return arr[mid];



        if(arr[mid]>k) {



            if(arr[mid-1]<k) {

                int diff=k-arr[mid-1];
                int diff2=arr[mid]-k;

                if(diff<diff2)
                    return arr[mid-1];

                return arr[mid];

            }

           return closestNumber(arr,startIndex,mid,k);



        }
        else {


            if(arr[mid+1]>k) {

                int diff=k-arr[mid];
                int diff2=arr[mid+1]-k;

                if(diff<diff2)
                    return arr[mid];

                return arr[mid+1];

            }
            return closestNumber(arr, mid+1, endIndex, k);

        }






    }



    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int k=sc.nextInt();

            int[] arr=new int[n];

            for (int i = 0; i < n; i++)
                arr[i]=sc.nextInt();


            System.out.println(closestNumber(arr,0,n,k));

        }


    }
}
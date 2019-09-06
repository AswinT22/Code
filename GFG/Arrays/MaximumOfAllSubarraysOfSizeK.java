package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0





import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumOfAllSubarraysOfSizeK {

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

    private static String maxOfAllSubArrOfK(int[] arr, int n,int k)
    {


        StringBuffer sb=new StringBuffer();
        LinkedList<Integer> index=new LinkedList<>();



        for (int i = 0; i <k ; i++) {

            while (!index.isEmpty() && arr[index.peekLast()] < arr[i])
                index.pollLast();
           index.addLast(i);


        }



        int currentStart=1;

        for (int i = k; i <n ; i++) {

            sb.append(arr[index.peekFirst()]).append(" ");

            while(!index.isEmpty() && index.peekFirst()<currentStart)
                index.pollFirst();


            while (!index.isEmpty() && arr[index.peekLast()] < arr[i])
                index.pollLast();


            index.addLast(i);


            ++currentStart;

        }
        sb.append(arr[index.peekFirst()]);

        return sb.toString().trim();


    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[n];
            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextInt();



            System.out.println(maxOfAllSubArrOfK(arr,n,k));







        }


    }
}
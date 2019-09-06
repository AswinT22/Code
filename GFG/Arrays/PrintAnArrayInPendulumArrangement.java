package GFG.Arrays;
//      https://practice.geeksforgeeks.org/problems/print-an-array-in-pendulum-arrangement/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class PrintAnArrayInPendulumArrangement {

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
            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextInt();

            Arrays.sort(arr);


            int pos=(n-1)/2;
            int[] res=new int[n];
            res[pos]=arr[0];

            for (int i = 1; i <n ; i++) {



                if(i%2==0)
                    res[pos-(i/2)]=arr[i];
                else
                    res[pos+((i+1)/2)]=arr[i];

            }
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i <n ; i++)
                sb.append(res[i]+" ");


            System.out.println(sb.toString().trim());


        }


    }
}
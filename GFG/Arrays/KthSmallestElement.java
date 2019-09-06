package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/kth-smallest-element/0/?ref=self



import java.util.*;
import java.lang.*;
import java.io.*;

public class KthSmallestElement {

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

            TreeSet<Integer> ss=new TreeSet<>();

            for (int i = 0; i < n; i++)
                //arr[i]=sc.nextInt();
                ss.add(sc.nextInt());

            int k=sc.nextInt();
            Iterator<Integer>it=ss.iterator();
            int count=1;
            while (k>count )
            {
                it.next();
                ++count;
            }

            System.out.println(it.next());



        }


    }
}
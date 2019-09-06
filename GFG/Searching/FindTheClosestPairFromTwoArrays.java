package GFG.Searching;

//https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays/0/?track=sp-arrays-and-searching&batchId=152


import java.util.*;
import java.lang.*;
import java.io.*;

public class FindTheClosestPairFromTwoArrays {

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

            int m=sc.nextInt();

            int[] A=new int[n];

            int[] B=new int[m];

            for (int i = 0; i <n ; i++)
                A[i]=sc.nextInt();

            for (int i = 0; i < m; i++)
                B[i]=sc.nextInt();

            int target=sc.nextInt();

            Arrays.sort(A);
            Arrays.sort(B);


            int pointerA=0;
            int pointerB=m-1;
            int ansA=0;
            int ansB=m-1;
            int minDiff=Integer.MAX_VALUE;
            while (pointerA<n && pointerB>=0)

            {

                int currentSum= A[pointerA]+B[pointerB];
                if(Math.abs(currentSum-target)<=minDiff)
                {

                    minDiff=Math.abs(currentSum-target);
                    ansA=pointerA;
                    ansB=pointerB;

                }

                 if(currentSum<target)
                    ++pointerA;
                 else
                     --pointerB;
            }

            System.out.println(A[ansA]+" "+B[ansB]);




        }


    }
}
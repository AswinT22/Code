package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/type-of-array/0/?track=sp-arrays-and-searching&batchId=152



import java.util.*;
import java.lang.*;
import java.io.*;

public class TypeOfArray {

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

            long[] arr=new long[n];

            for (int i = 0; i <n ; i++)

                arr[i]=sc.nextLong();


            int maxIndex=0;
            int minIndex=0;
            long max=arr[0];
            long min = arr[0];
            for (int i = 1; i <n ; i++)
            {



                if(arr[i]>max)
                {
                    maxIndex=i;
                    max=arr[i];
                    continue;

                }

                if(arr[i]<min)
                {
                    minIndex=i;
                    min=arr[i];

                }


            }


            if (maxIndex==0){

                if (minIndex==n-1)

                    System.out.println(arr[maxIndex]+" "+2);
                else
                    System.out.println(arr[maxIndex]+" "+4);



            }
            else if(maxIndex==n-1 ){


                if (minIndex==0)

                    System.out.println(arr[maxIndex]+" "+1);
                else
                    System.out.println(arr[maxIndex]+" "+3);


            }

            else {

                if(arr[maxIndex+1]>arr[minIndex])
                    System.out.println(arr[maxIndex]+" "+3);
                else
                    System.out.println(arr[maxIndex]+" "+4);



            }


        }


    }
}
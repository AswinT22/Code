package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/find-the-fine/0/?ref=self

import java.util.*;
import java.lang.*;
import java.io.*;

public class FindTheFine{

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

            int  date=sc.nextInt();


            int[] car=new int[n];

            for (int i = 0; i < n; i++)

                car[i]=sc.nextInt();


            int[] fine=new int[n];
            for (int i = 0; i < n; i++)
                fine[i]=sc.nextInt();





            int equals=date%2==0?1:0;

            long sum=0;
            for (int i = 0; i < n; i++)

                if(car[i]%2==equals)
                    sum+=fine[i];



            System.out.println(sum);
            }


        }


    }

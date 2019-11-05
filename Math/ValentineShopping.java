package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ValentineShopping
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
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

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader s=new FastReader();

        int testCases=s.nextInt();
        while(testCases-- >0) {
            int n = s.nextInt();
            int m = s.nextInt();

            while (n-- >0){

                int index=0;
                double minVal=Double.MAX_VALUE;
                for (int i = 1; i <=m ; i++)
                {
                    double val=100;

                    for (int j = 0; j <3 ; j++) {

                        int discount=s.nextInt();
                        if(discount>0) val*=(1-(discount/100d));
                    }

                    if (val<minVal)
                    {
                        minVal=val;
                        index=i;

                    }




                }

                System.out.print(index+" ");

            }

            System.out.println();


        }




    }
} 
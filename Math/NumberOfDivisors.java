import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfDivisors
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
            long n = s.nextLong();


           long numberOfDivisors=1;
            while (n%2==0)
            {
         
                ++numberOfDivisors;
                n /= 2;
            }

            for (int i = 3; i <= Math.sqrt(n); i+= 2)
            {
                long currentCount=0;
                while (n%i == 0)
                {
                    // System.out.print(i + " ");

                    ++currentCount;
                    n /= i;
                }
                numberOfDivisors*=(++currentCount);
            }
            if (n > 2){
                numberOfDivisors*=(2);

            }
            System.out.println(numberOfDivisors);
        }
    }}

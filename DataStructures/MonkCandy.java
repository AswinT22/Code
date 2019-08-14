import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class MonkCandy {
    public static void main(String args[] ) throws Exception {
        FastReader s=new FastReader();

        int testCases=s.nextInt();

        for (int i = 0; i < testCases; i++) {


            long returnVal=0;
            int n=s.nextInt();
            int k=s.nextInt();


            PriorityQueue<Long> arr=new PriorityQueue<>(n, Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                arr.add(s.nextLong());
            }

            for (int j = 0; j < k; j++) {

                long val=arr.poll();
                returnVal+=val;
                arr.add(val/2);
            }
            System.out.println(returnVal);
        }

    }

    private static int findMaxIndex(long[] arr,int n){

        int maxIndex=0;
        for (int i = 1; i <n ; i++)

            if(arr[i]>arr[maxIndex])maxIndex=i;



        return maxIndex;


    }

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

    }
}


package GFG.Searching;
//https://practice.geeksforgeeks.org/problems/super-primes/0






import java.util.*;
import java.lang.*;
import java.io.*;


public class SuperPrimes {

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
    static final int[] seive;
    static final int[] superPrimeCount;
    static {



         seive=new int[10000000+1];

        seive[0]=1;
        seive[1]=1;


        for (int i = 2; i*i <=10000000 ; i++) {

            //if seive[i]==0 is a prime
            if(seive[i]==0){




                for (int j = i*2; j <=10000000 ; j+=i) {

                    seive[j]=1;
                }
            }

        }

        superPrimeCount=new int[10000000+1];



//        hint:
//        1) sum of two odd no. is even.
//        2) even no. cannot be prime.
//        3) 2 is the only even no. which is prime.
//        hence we are checking seive[i]==0 && seive[i-2]==0


        for (int i = 5; i <=10000000 ; i++) {

            if (seive[i]==0 && seive[i-2]==0)
                superPrimeCount[i]+=(superPrimeCount[i-1]+1);
            else
                superPrimeCount[i]=superPrimeCount[i-1];

        }



    }







    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();


            System.out.println(superPrimeCount[n]);
    }
}
}
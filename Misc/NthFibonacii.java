package Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;
import java.util.StringTokenizer;

public class NthFibonacii {

    public static void main(String[] args) {



        FastScanner sc=new FastScanner(System.in);

        System.out.print("Enter number of test cases:");
        long numberOfTestcases=sc.nextInt();
        long count=1;
        long passed=0;
        while (count<=numberOfTestcases) {
            System.out.print("\n \n");
            System.out.println("--------------------- Test Case " + count + "  ---------------------");
            ++count;
            Random rand = new Random();
            // This will generate number from 0 to 100
            int  n= rand.nextInt(50) ;
            System.out.println(n+"th Fibonacci Number");
            int res1=fibonacciFast(n);
            BigInteger res2=fibanacciIncremental(n);

            if(res2.compareTo(BigInteger.valueOf(res1))==0){

                ++passed;
                System.out.println("Ok!! Number is "+res1);
            }

            else
                System.out.print("Wrong !!! for :"+n+"    Naive:"+res2+"   Fast:"+res1);


        }

        System.out.print("\n \n");
        System.out.println("Total: "+numberOfTestcases+"   Passed:"+passed+"  Failed:"+(numberOfTestcases-passed));
    }

    static BigInteger fibanacciIncremental(int n){

        if(n<=1)
            return new BigInteger(String.valueOf(n));
        else {

            int i=1;
            BigInteger n1=new BigInteger("0");
            BigInteger n2=new BigInteger("1");

            while (i!=n) {
                ++i;
//                long temp=n1+n2;
                BigInteger temp=n1.add(n2);
                n1=n2;
                n2=temp;



            }


            return n2;

        }
    }

    static int fibonacciFast(int n){

        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));

    }



    static double fibonacciNumberOfDigits(int n){

//        BigDecimal rootFive=new BigDecimal(String.valueOf(Math.sqrt(5)));
//        BigDecimal one=new BigDecimal("1");
//        BigDecimal two=new BigDecimal("2");
//
//        return ((one.divide(rootFive,2, RoundingMode.HALF_UP)).multiply(one.add(rootFive).divide(two,2, RoundingMode.HALF_UP).pow(n))).subtract(((one.divide(rootFive,2, RoundingMode.HALF_UP)).multiply(one.subtract(rootFive).divide(two,2, RoundingMode.HALF_UP).pow(n)))).toBigInteger();
//        //return  ((1/rootFive)*(Math.pow(((1+rootFive)/2),n) - Math.pow(((1-rootFive)/2),n)));

        if (n == 1)
            return 1;

        // using phi = 1.6180339887498948
        double d = (n * Math.log10(1.6180339887498948)) -
                ((Math.log10(5)) / 2);

        return Math.ceil(d);
    }

    static class FastScanner{

        BufferedReader br;
        StringTokenizer st;


        FastScanner(InputStream stream){

            try {
                br= new BufferedReader(new InputStreamReader(stream));
            }
            catch (Exception ex){
                ex.printStackTrace();
            }


        }

        String next(){

            while (st==null||!st.hasMoreTokens())
            {
                try {

                    st=new StringTokenizer(br.readLine());
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt(){ return  Integer.parseInt(next());}

    }
}

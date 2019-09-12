package Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.StringTokenizer;

public class Greeter {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        FastScanner sc=new FastScanner(System.in);
       float x= sc.nextInt();
       int y=sc.nextInt();



        long start = System.nanoTime();
        double res=power(x,y);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;



        long start1 = System.nanoTime();
        double res1=math(x,y);
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;



        System.out.println(timeElapsed+"   "+res);
        System.out.println(timeElapsed1+"   "+res1);
    }

    static double math(float x,int y){
        return Math.pow(x,y);
    }

    static double power(float x, int y)
    {
        double temp;
        if( y == 0)
            return 1;
        temp = power(x, y/2);

        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }

static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
        try {
            br = new BufferedReader(new
                    InputStreamReader(stream));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}
}

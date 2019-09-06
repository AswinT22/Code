package GFG.Searching;

//public class MagnetArrayProblem {
//}

import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/magnet-array-problem/0/?track=sp-arrays-and-searching&batchId=152

public class MagnetArrayProblem {

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


    static  double findNetForceZero(int[] a,int n,double l,double r){

        double d=0.000000000008854;
        //value of epsilon


        while (true) {
            double mid = l + (r - l) / 2.0;

            double force = 0.0d, x;
            for (int i = 0; i < n; i++) {
                x = 1.0 / (mid - a[i]);
                force += x;
            }

            if (Math.abs(force)<  d)
                return mid;

            if (force < 0)
                r=mid;
            else
               l=mid;

        }

    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int[] arr=new int[n];

            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextInt();



            DecimalFormat f=new DecimalFormat("#.00");
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i <n-1 ; i++) {
                double ans=findNetForceZero(arr,n,arr[i],arr[i+1]);

                sb.append(f.format(ans)).append(" ");

            }


            System.out.println(sb);

        }


    }
}

//Recursive Solution is not preferred, because of stackoverflow

//    static  double findNetForceZero(int[] a,int n,double l,double r){
//
//        double d=0.0000000000001;
//
//        double mid=l+(r-l)/2.0;
//
//        double force=0.0d,x;
//        for (int i = 0; i <n ; i++) {
//            x=1.0/(mid-a[i]);
//            force+=x;
//        }
//
//        if(Math.abs(force)<d)
//            return mid;
//
//        if (force<0)
//            return findNetForceZero(a,n,l,mid);
//        else
//            return findNetForceZero(a,n,mid,r);
//
//
//
//    }


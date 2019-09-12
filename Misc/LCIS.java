package Misc;

import java.util.*;
import java.lang.*;
import java.io.*;

class LCIS {
    public static void main (String[] args) {


        FastScanner sc=new FastScanner(System.in);

        int testCases=sc.nextInt();
        for (int i = 0; i <testCases ; i++) {


            int a=sc.nextInt();
            int[] array1=new int[a];
            for (int j = 0; j <a ; j++)
                array1[j]=sc.nextInt();


            int b= sc.nextInt();
            int[] array2=new int[b];

            for (int j = 0; j < b; j++)
                array2[j]=sc.nextInt();

            System.out.println(lcis(array1,array2));

            System.out.println(longestIncreasingCommonSubSequence(array1,array2));
        }



        //code
    }

    static int longestIncreasingCommonSubSequence(int[] a,int[]b){


        int lenA=a.length;
        int lenB=b.length;

        int[] table=new int[lenB];

        for (int i = 0; i <lenA ; i++) {
            int cur=0;
            for (int j = 0; j <lenB ; j++) {

                if (a[i]==b[j])
                    if (cur+1>table[j])
                        table[j]=cur+1;
                if(a[i]>b[j])
                    if (table[j]>cur)
                        cur=table[j];


            }
        }

        int res=0;

        for (int i = 0; i < lenB; i++) {

            if (table[i]>res)
                res=table[i];
        }

        return res;
    }



    public static int lcis(int[] a,int[]b) {

        int[] temp=new int[b.length];

        for (int i = 0; i <a.length ; i++) {
            int cur=0;
            for (int j = 0; j < b.length; j++) {

                if(a[i]==b[j])
                    if (cur+1>temp[j])
                        temp[j]=cur+1;
                if(b[j]<a[i])
                    if(cur<temp[j])
                        cur=temp[j];

            }
        }
        int res=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]>res)
                res=temp[i];
        }
        return res;





    }

    static class FastScanner{
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream inputStream) {


            try {
                br= new BufferedReader(new InputStreamReader(inputStream));
            }
           catch (Exception ex)
           {
               ex.printStackTrace();
           }
        }

        public String next(){

            while ( st==null || !st.hasMoreTokens())
            {
                     try {
                         st= new StringTokenizer(br.readLine());
                     }
                     catch (IOException ex)
                     {
                         ex.printStackTrace();
                     }
            }
            return st.nextToken();
        }
        public int nextInt(){

            return Integer.parseInt(next());
        }

    }
}
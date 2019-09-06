package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/longest-common-increasing-subsequence/0/?track=sp-arrays-and-searching&batchId=152


import java.io.*;
import java.lang.*;

import java.util.Arrays;



public class LongestCommonIncreasingSubsequence {
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


    public static void main (String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        while (testCases  >0) {
            --testCases;
            int lenA=Integer.parseInt(br.readLine().trim());
            String lineA = br.readLine();
            String[] strA = lineA.trim().split("\\s+");
            int[] a=Arrays.stream(strA).mapToInt(Integer::parseInt).toArray();
            int lenB=Integer.parseInt(br.readLine());
            String lineB = br.readLine();
            String[] strB = lineB.trim().split("\\s+");
            int[] b=Arrays.stream(strB).mapToInt(Integer::parseInt).toArray();


            System.out.println(lcis(a,b));



        }
    }
}
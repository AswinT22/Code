package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array/0/?track=sp-arrays-and-searching&batchId=152


import java.lang.*;
import java.io.*;


public class LongestCommonPrefixInAnArray {
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for (int i = 0; i <testCases ; i++) {
            int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            String prefix=strs[0];
            for (int j = 1; j <n ; j++) {
                //StringBuffer nextPrefix=new StringBuffer();
                int count=0;
                int len= strs[j].length()>prefix.length()?prefix.length():strs[j].length();
                for (int k = 0; k < len; k++) {

                    if(strs[j].charAt(k)==prefix.charAt(k))
                        ++count;
                    else
                        break;

                }


                prefix=prefix.substring(0,count);

                if(count==0)
                    break;

            }


            System.out.println(prefix.length()>0?prefix:"-1");
        }
    }
}
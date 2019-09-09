package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/minimum-shift-for-longest-common-prefix/0/?track=sp-strings&batchId=152

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestCommonPrefix {
    public static void main (String[] args) throws IOException{
        //code

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());

        while (testCases-- >0){

            String A=br.readLine();
            String B=br.readLine();

            int i=0;
            int j=0;
            int count=0;
            int index=0;
            int max_Count=0;
            int ChoosenIndex=0;
                while (i<A.length() && j<B.length())
                {

                    if (A.charAt(i)==B.charAt(j)) {
                        ++i;
                        ++j;
                        ++count;
                    }
                    else {

                        i=0;
                        ++j;
                        if(count>max_Count)
                        {
                            max_Count=count;
                            ChoosenIndex=index;

                        }
                        count=0;
                        index=j;

                    }

                }
            if(count>max_Count)
            {
                max_Count=count;
                ChoosenIndex=index;

            }
                if(max_Count>0)
                System.out.println(ChoosenIndex+" "+A.substring(0,max_Count));

                else
                    System.out.println("-1");

        }
    }
}
package GFG.Strings;

//https://practice.geeksforgeeks.org/problems/distinct-palindromic-substrings/0/?track=sp-strings&batchId=152



import java.util.*;
import java.lang.*;
import java.io.*;

public class DistinctPalindromicSubStrings {


    private static int distinctPalindromicStrings(String str){


        int n=str.length();

        Set<String> set=new HashSet<>();

        for (int i = 0; i < n; i++) {

            int j=i,k=i;
            while (j>=0 && k<n && str.charAt(j)==str.charAt(k)){


                set.add(str.substring(j,k+1));
                j--;
                k++;


            }

            j=i-1;
            k=i;
            while (j>=0 && k<n && str.charAt(j)==str.charAt(k)){


                set.add(str.substring(j,k+1));
                j--;
                k++;


            }

        }



        return set.size();

    }



    public static void main (String[] args) throws IOException{

        //code

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int testCases=Integer.parseInt(br.readLine());

        while (testCases-- >0){


            String str=br.readLine();

            System.out.println(distinctPalindromicStrings(str));


        }
    }
}
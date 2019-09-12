package GFG.Strings;

//https://practice.geeksforgeeks.org/problems/longest-palindromic-subsequence/0


import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestPalindromicSubsequence {


    private static int longestPalindromicSubSequence(String str){
        int n=str.length();
        int[][] arr=new int[n][n];

        for (int i = 0; i <n ; i++) {

            arr[i][i]=1;

        }
        for (int l = 2; l <=n ; l++) {


            for (int i = 0; i <n-l +1; i++) {

                int j=i+l-1;


                if(l==2 && str.charAt(i)==str.charAt(j))
                {

                    arr[i][j]=2;

                }
                else if(str.charAt(i)==str.charAt(j)){


                    arr[i][j]=2+arr[i+1][j-1];

                }
                else {


                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);

                }



            }


            }






        return arr[0][n-1];




    }


    public int calculateRecursive(char str[],int start,int len){
        if(len == 1){
            return 1;
        }
        if(len ==0){
            return 0;
        }
        if(str[start] == str[start+len-1]){
            return 2 + calculateRecursive(str,start+1,len-2);
        }else{
            return Math.max(calculateRecursive(str, start+1, len-1), calculateRecursive(str, start, len-1));
        }
    }



    public static void main (String[] args) throws IOException{
        //code


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());

        while(testCases-- >0){


            String str=br.readLine();

            System.out.println(longestPalindromicSubSequence(str));


        }


    }
}
package GFG.Strings;

// https://practice.geeksforgeeks.org/problems/palindrome-string/0/?track=sp-strings&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeString {




    public static void main (String[] args) throws  IOException{
        //code

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());

        while (testCases-- > 0){



            int n=Integer.parseInt(br.readLine());

            String str=br.readLine();

            boolean flag=true;

            for (int i = 0; i <n/2 ; i++) {

                if (str.charAt(i)!=str.charAt(n-1-i))
                {

                    flag=false;
                    break;

                }

            }


            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");


        }


    }
}
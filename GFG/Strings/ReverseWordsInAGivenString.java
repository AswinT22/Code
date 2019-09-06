package GFG.Strings;

//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0/?track=sp-strings&batchId=152

import java.lang.*;
import java.io.*;

public class ReverseWordsInAGivenString{
    public static void main (String[] args) throws  IOException{
        //code


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());

        while (testCases-- >0){

            String str=br.readLine();

            String[] strArray=str.split("\\.");


            StringBuilder sb=new StringBuilder();

            for (int i = strArray.length-1; i >=0 ; i--) {


                sb.append(strArray[i]).append(".");
            }


            if (sb.length()>1)
                System.out.println(sb.deleteCharAt(sb.length()-1));
            else
                System.out.println();


        }

    }
}
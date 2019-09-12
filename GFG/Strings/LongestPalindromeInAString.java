package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0/?track=sp-strings&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;


public class LongestPalindromeInAString{

    static  Map<String,String> map;
    public static void main (String[] args) throws IOException {


        //code


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());

        while (testCases-- >0){


            String s=br.readLine();


            map=new HashMap<>();
            System.out.println(findLongestPalindrome(s,0,s.length()-1));


        }


    }

    private static String maxOf2(String A,String B){

        int lenA=A.length();

        int lenB=B.length();


        return lenA>lenB?A:B;


    }


    private static boolean checkPalindrome(String str,int left ,int right){

       if (left>=right)
           return true;



       if (str.charAt(left)!=str.charAt(right))
           return false;

       return checkPalindrome(str,left+1,right-1);

    }

    private static String findLongestPalindrome(String s,int left,int right){


        String key=left+","+right;


        if(map.containsKey(key))
            return map.get(key);


        if(left>=right)
            return s.substring(left,right+1);







        String s1="";
        String s2,s3;

        if (s.charAt(left)==s.charAt(right)){


            if(checkPalindrome(s,left+1,right-1))
                return  s.substring(left,right+1);




        }





        s2=findLongestPalindrome(s,left+1,right);

        s3=findLongestPalindrome(s,left,right-1);

        map.put( key,maxOf2(maxOf2(s1,s2),s3));

        return map.get(key);
    }
}



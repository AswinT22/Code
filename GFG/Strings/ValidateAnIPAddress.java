package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/validate-an-ip-address/1/?track=sp-strings&batchId=152


import java.util.*;
import java.io.*;
public class ValidateAnIPAddress{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();


            if(isValidIP(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static boolean isValidIP(String s){
        //Write your code here






            try {

                char start=s.charAt(0);
                char end=s.charAt(s.length()-1);

                //checking if start end char are numeric because apart from these edge cases Integer.parseInt will throw an exception
                if(start<48 || start>57 || end<48 || end>57)
                    return false;

                String[] strArray=s.split("\\.");

                if(strArray.length!=4)
                    return false;

                for (int i = 0; i < strArray.length; i++) {
                int num = Integer.parseInt(strArray[i]);

                if (num < 0 || num > 255)
                    return false;

                if (String.valueOf(num).length() != strArray[i].length())
                    return false;

            }} catch (NumberFormatException e) {
                return false;
            }



        return true;
    }
}
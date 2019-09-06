package GFG.Searching;


//https://practice.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string/0/?track=sp-arrays-and-searching&batchId=152

import java.lang.*;
import java.io.*;

public class RemoveConsonantsFromAString{



    public static void main (String[] args) throws IOException{
        //code

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(sc.readLine());
        //sc.readLine();

        while (testCases-- > 0){



            String str=sc.readLine();

            StringBuilder sb=new StringBuilder();
            for(int i=0; i<str.length();i++)
            {
                char c=str.charAt(i);
                switch (c) {

                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    case ' ':
                        sb.append(c);
                        break;
                }




            }

            if(sb.length()>0)
                System.out.println(sb);
            else
                System.out.println("No Vowel");

        }




    }


}

package GFG.Strings;

//https://practice.geeksforgeeks.org/problems/binary-string/0/?track=sp-strings&batchId=152



import java.lang.*;
import java.io.*;

public class BinaryString {
    public static void main (String[] args) throws  IOException{
        //code

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());


        while (testCases-- >0){

            int n=Integer.parseInt(br.readLine());

            char[] charArray=new char[n];

            br.read(charArray,0,n);

            if (testCases!=0)
                br.readLine();
            int count=-1;
            for (int i = 0; i <n ; i++) {

                if(charArray[i]=='1')


                    ++count;

                }

            //sum of first n natural numbers
            System.out.println((count*(count+1))/2);
        }
        br.close();



    }
}
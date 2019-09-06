package GFG.Arrays;
//https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class ImmediateSmallerElement {


    static class  FastReader{

        StringTokenizer st;
        BufferedReader br;


        FastReader(){

            br=new BufferedReader(new InputStreamReader(System.in));


        }

        String next(){
            while (st==null||!st.hasMoreTokens()) {
                try {


                    st = new StringTokenizer(br.readLine());

                } catch (Exception ex) {

                    ex.printStackTrace();

                }
            }

            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }




    }


    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int previousEle=sc.nextInt();
            StringBuilder st=new StringBuilder("");
            while (n-- >1){

                int currentElement=sc.nextInt();

                if(previousEle>currentElement)
                    st.append(currentElement+" ");
                else
                    st.append(-1 +" ");


                previousEle=currentElement;

            }

            st.append(-1);

            System.out.println(st);
        }


    }
}
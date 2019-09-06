package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/sort-in-specific-order/0/?track=sp-arrays-and-searching&batchId=152
import java.util.*;
import java.lang.*;
import java.io.*;

public class SortInSpecificOrder {

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

            PriorityQueue<Long> oddQueue=new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Long> evenQueue=new PriorityQueue<>();
            for (int i = 0; i <n ; i++) {
                long temp=    sc.nextInt();

                if(temp%2==0)
                    evenQueue.add(temp);
                else
                    oddQueue.add(temp);

            }

            StringBuilder sb=new StringBuilder();
            while (!oddQueue.isEmpty())
                sb.append(oddQueue.poll()).append(" ");

            while (!evenQueue.isEmpty())
                sb.append(evenQueue.poll()).append(" ");

            System.out.println(sb.toString().trim());


        }


    }
}
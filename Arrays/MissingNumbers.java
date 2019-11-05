package Arrays;
import java.io.*;
import java.lang.*;


public class MissingNumbers {
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        for (int i = 0; i <testCases ; i++) {
            int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            long sum=0;
            for (int j = 0; j <n-1 ; j++) {
                sum+=Integer.parseInt(strs[j]);
            }

            // Sum of first n natural numbers is n*(n+1)/2
            System.out.println(((n*(n+1))/2)-sum); //faster

            //(int)(((n/2.0)*(n+1))-sum) to reduce the probability of overflow //slower
            //but here we don't really care as we dont store this number
        }
    }
}

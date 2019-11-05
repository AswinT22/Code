package GFG.Searching;
//https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1/?track=sp-arrays-and-searching&batchId=152


import java.util.*;
import java.lang.*;

public class IndexOfAnExtraElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n-1];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n-1;i++)
                b[i]=sc.nextInt();

            System.out.println(findExtra(a,b,n));
        }
    }


/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/

    public static int findExtra(int[] a, int[] b, int n)
    {
        // add code here.


        for (int i = 0; i <n-1 ; i++) {

            if (a[i]!=b[i])
                return i;

        }

        return n-1;
    }
}
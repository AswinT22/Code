package GFG.Searching;


//https://practice.geeksforgeeks.org/problems/peak-element/1/?ref=self

import java.util.*;
public class PeakElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            int A=peakElement(a,n);
            int f=0;
            if(n==1)
                f=1;
            else
            if(A==0 && a[0]>=a[1])
                f=1;
            else if(A==n-1 && a[n-1]>=a[n-2])
                f=1;
            else if(a[A] >=a[A+1] && a[A]>= a[A-1])
                f=1;
            else
                f=0;
            System.out.println(f);
        }
    }

    public static int peakElement(int[] a,int n)
    {
        //add code here.

        int ele=0;
        for (int i = 1; i <n ; i++) {

            if(a[i]<a[ele])
                return ele;

            ele=i;

        }


        return n-1;
    }
}
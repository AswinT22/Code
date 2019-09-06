package GFG.Arrays;

//https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1/?track=sp-arrays-and-searching&batchId=152

import java.util.Scanner;

public class CountDistinctElementsInEveryWindow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            //int k = sc.nextInt();


            countDistinct(a,k,n);
            System.out.println();

            t--;
        }
    }


/*This is a function problem.You only need to complete the function given below*/
/*You are required to complete below method */

    static void countDistinct(int A[], int k, int n)
    {
        // Your code here

        int[] hash=new int[100];
        int currentUnique=0;
        for (int i = 0; i < k; i++) {

            if (hash[A[i] % 100] == 0) {

                ++currentUnique;
            }
            ++hash[A[i] % 100];
        }
        StringBuilder sb=new StringBuilder(String.valueOf(currentUnique));


        for (int i = k; i <n ; i++) {

            if(hash[A[i-k]%100]!=0)
            {
                --hash[A[i-k]%100];
                if(hash[A[i-k]%100]==0)
                    --currentUnique;


            }

            if (hash[A[i] % 100] == 0) {

                ++currentUnique;
            }

            ++hash[A[i] % 100];

            sb.append(" ").append(currentUnique);

        }


        System.out.print(sb);


    }
}

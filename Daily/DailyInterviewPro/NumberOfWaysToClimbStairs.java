package Daily.DailyInterviewPro;

//https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair/0

//You are given a positive integer N which represents the number of steps in a staircase.
// You can either climb 1 or 2 steps at a time. Write a function that returns the number of unique ways to climb the stairs.


import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberOfWaysToClimbStairs {

        static Hashtable<Integer,Integer> table=new Hashtable<>();

        static {
            long mod=(long)Math.pow(10,9)+7;
            table.put(1,1);
            table.put(2,2);
            int a=1,b=2;
            for(int i=3;i<=100000;i++){
                int temp=(int)((a+b)%mod );
                table.put(i,temp);
                a=b;
                b=temp;
            }

        }
        public static void main (String[] args) {
            //code
            Scanner sc=new Scanner(System.in);
            int testcases=sc.nextInt();
            while(testcases-- >0){

                System.out.println(table.get(sc.nextInt()));
            }
        }



    }


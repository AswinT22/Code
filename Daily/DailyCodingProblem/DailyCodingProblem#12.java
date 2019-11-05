package Daily.DailyCodingProblem;
import java.util.Hashtable;
import java.util.Scanner;


//https://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair/0

//This problem was asked by Amazon.
//
//        There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
//        Given N, write a function that returns the number of unique ways you can climb the staircase.
//        The order of the steps matters.
//
//        For example, if N is 4, then there are 5 unique ways:
//
//        1, 1, 1, 1
//        2, 1, 1
//        1, 2, 1
//        1, 1, 2
//        2, 2

class countWays{



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

    // What if, instead of being able to climb 1 or 2 steps at a time,
    // you could climb any number from a set of positive integers X?
    //
    // For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

    //https://www.dailycodingproblem.com/blog/staircase-problem/
}
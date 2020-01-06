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


class countWays {

    static Hashtable<Integer, Integer> table = new Hashtable<>();
    static Hashtable<Integer, Integer> cache = new Hashtable<>();
    static long mod = (long) Math.pow(10, 9) + 7;

    // Assuming 1<=N<=10^5
    static {
        table.put(1, 1);
        table.put(2, 2);
        int a = 1, b = 2;
        for (int i = 3; i <= 100000; i++) {
            int temp = (int) ((a + b) % mod);
            table.put(i, temp);
            a = b;
            b = temp;
        }
        cache.put(0, 1);
    }

    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        int[] X = {1, 2};
        while (testcases-- > 0) {

            //System.out.println(table.get());
            for (int n = 1; n < (int) Math.pow(10, 5); n++) {
                int tableValue = table.get(n);
                int countWays = countWays(n, X);
                //Comparing the results from static approach and the dynamic approach
                //The values in the table are calculated assuming the steps are only 1,2
                // On the other hand countWays() takes an array with the types of stepCount
                if (tableValue == countWays) {
                    System.out.println("Passed for " + n);
                } else {
                    System.out.println("Failed for " + n + " Table value:" + tableValue + "   countValue:" + countWays);

                }
            }

        }
    }

// What if, instead of being able to climb 1 or 2 steps at a time,
// you could climb any number from a set of positive integers X?
//
// For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

//https://www.dailycodingproblem.com/blog/staircase-problem/

// For Nth step using types of stepCount from X

    public static int countWays(int n, int[] X) {

        for (int i = 0; i <= n; i++) {
            int sum = 0;
            boolean flag = false;
            for (int x : X) {

                if (i - x > 0) {
                    sum += cache.get(i - x) % mod;
                }

                if (i == x) {
                    flag = true;
                }
            }

            if (flag) {
                sum += 1;
            }
            cache.put(i, ((int) (sum % mod)));
        }

        return cache.get(n);
    }

}

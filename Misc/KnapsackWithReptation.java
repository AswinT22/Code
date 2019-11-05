package Misc;


public class KnapsackWithReptation {

    private static int max(int i, int j) {
        return (i > j) ? i : j;
    }

    // Returns the maximum value with knapsack
    // of W capacity
    private static int unboundedKnapsack(int W, int n,
                                         int[] val, int[] wt) {

        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int[] dp = new int[W + 1];

        // Fill dp[] using above recursive formula
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = max(dp[i], dp[i - wt[j]] +
                            val[j]);
                }
            }
        }
        return dp[W];
    }

    //my implementation
    private static int knapSackWithReptation(int W,int n,int[] val,int[] wt){

        int[] table=new int[W+1];


        for (int i = 1; i <=W ; i++) {

            for (int j = 0; j < n; j++) {

                if(i>=wt[j])
                {
                    int t=i-wt[j];
                    int value=table[t]+val[j];

                    if(value>table[i])
                        table[i]=value;

                }
            }


        }

        return table[W];
    }



    public static void main(String[] args) {
        int W = 100;
        int[] val = {10, 30, 20};
        int[] wt = {5, 10, 15};
        int n = val.length;
        System.out.println(knapSackWithReptation(W, n, val, wt));
        //gfg implementation00..................

        System.out.println(unboundedKnapsack(W, n, val, wt));
    }
}

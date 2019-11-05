package Misc;

public class KnapsackWithoutReptation {


    private static int knapSackWithoutRepetation(int W,int n,int[] val,int[] wt){

        int[][] table=new int[n+1][W+1];

        for(int i=0;i<=n;i++)
            table[i][0]=0;

        for(int i=0;i<=W;i++)
            table[0][i]=0;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=W;j++)
            {
                if (j>=wt[i-1])
                {
                    int value=table[i-1][j-wt[i-1]]+val[i-1];

                    if (value>table[i-1][j])
                        table[i][j]=value;
                    else
                        table[i][j]=table[i-1][j];


                }
                else
                    table[i][j]=table[i-1][j];


            }


        }

        int v=table[n][W];
        int N=n;
        int WW=W;
        int[] traceBack=new int[n];
        while(n>0 && W>0){
            int t=W-wt[n-1];
            int pre=table[n-1][W];
            if (pre < (table[n-1][t]+val[n-1]))
            {
                traceBack[n-1]=1;
                W-=wt[n-1];
            }
            else

                traceBack[n-1]=0;



            --n;
        }

        for (int i = 0; i <N ; i++) {
            if (traceBack[i]==1)
                System.out.println(wt[i]+": "+val[i]);
        }

        return table[N][WW];

    }

    public static void main(String[] args) {
        int W =6;
        int[] val = {30, 14, 16, 9};
        int[] wt = {6, 3, 4, 2};
        int n = val.length;
        System.out.println(W+": "+knapSackWithoutRepetation(W, n, val, wt));


    }
}

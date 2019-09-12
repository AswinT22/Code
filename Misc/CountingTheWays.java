package Misc;

import java.util.*;

public class CountingTheWays {
    static int MOD=(int)(1e9+7);
    static int n;
    static int[] vs;
    static long left, right;
    static int max;
    static int[] nums;
    static int multi;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        vs = new int[n];
        for (int i=0;i<n;++i)vs[i]=sc.nextInt();
        left=sc.nextLong();
        right=sc.nextLong();

        System.out.println(new CountingTheWays().solve()+"");
    }

    int go(long val) {
        int res=0;
        for (int i=0, maxi=(int)Math.min(val, max); i<=maxi; ++i) {
            long tn = (val-i) / multi;
            long up=1, down=1;
            for (int j=0;j<n;++j) {
                up =(tn+n-j) % MOD * up % MOD;
                down = (down*(n-j)) % MOD;
            }
            tn=1;
            int left=MOD-2;
            while(left>0) {
                if (left%2 == 1)tn=(tn*down)%MOD;
                down=(down*down)%MOD;
                left/=2;
            }
            tn = tn * up% MOD;
            tn = tn * nums[i] % MOD;
            res+=tn;
            res%=MOD;
        }
        return res;
    }

    long solve() {
        long res=0;
        int s=1;
        for (int v:vs)s*=v;
        multi=s;
        max=0;
        for (int v:vs)max+=v*(s/v-1);

        nums=new int[max+1];
        for (int i=0;i<n;++i) {
            int tv=vs[i];
            if (i==0) {
                nums[0] = 1;
                int t=tv;
                while(t<=max) {
                    nums[t] = 1;
                    t+=tv;
                }
            } else {
                int[] nums2=new int[max+1];
                for (int j=0;j<=max;++j) {
                    nums2[j] = nums[j];
                    if (j>=tv) {
                        nums2[j] += nums2[j-tv];
                        nums2[j]%=MOD;
                    }
                }
                nums=nums2;
            }
        }

        long[][] cs=new long[n+1][n+1];
        cs[0][0] = 1;
        for (int i=1;i<=n;++i) {
            cs[i][0] = cs[i][i] = 1;
            for (int j=1;j<i;++j) {
                cs[i][j]  = (cs[i-1][j-1] + cs[i-1][j]) % MOD;
            }
        }

        int[] nums2=new int[max+1];
        for (int i=0; i<=max; ++i) {
            nums2[i] = nums[i];
            for (int j=1;j<=n;++j) {
                if (i< multi *j)continue;
                long t=cs[n][j] * nums[i-multi*j]%MOD;
                if (j%2==1)t=-t;
                nums2[i] = (int)((nums2[i] + t + MOD)%MOD);
            }
        }
        nums = nums2;

        return (go(right) - go(left-1) + MOD)%MOD;
    }
}
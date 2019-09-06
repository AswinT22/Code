package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/longest-common-substring/0/?track=sp-strings&batchId=152


    import java.util.*;
    import java.lang.*;
    import java.io.*;

public class LongestCommonSubstring {

        private static  int longestCommonSubString(char[] A,int n,char[] B,int m){

            int[][] table=new int[n+1][m+1];
            int max=0;
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= m; j++) {

                    if(A[i]==B[j]){


                        table[i][j]=table[i-1][j-1]+1;

                        max=Math.max(max,table[i][j]);


                    }

                    else

                        table[i][j]=0;




                }
            }


            return max;

        }
        public static void main (String[] args) throws IOException{
            //code

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            int testcases=Integer.parseInt(br.readLine());

            while (testcases-- >0){

                StringTokenizer st=new StringTokenizer(br.readLine());

                int n=Integer.parseInt(st.nextToken());
                int m=Integer.parseInt(st.nextToken());

                char[] A=new char[n+1];
                char[] B=new char[m+1];

                br.read(A,1,n);
                br.readLine();
                br.read(B,1,m);

                if (testcases!=0)
                    br.readLine();


                System.out.println(longestCommonSubString(A,n,B,m));


            }
        }
    }
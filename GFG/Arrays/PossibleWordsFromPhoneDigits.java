package GFG.Arrays;

//
import java.util.*;
import java.lang.*;
import java.io.*;

public class PossibleWordsFromPhoneDigits{

    static final Map<Integer,Character[]> lettersMap=new HashMap<>();


    static {

        lettersMap.put(2,new Character[]{'a','b','c'});
        lettersMap.put(3,new Character[]{'d','e','f'});
        lettersMap.put(4,new Character[]{'g','h','i'});
        lettersMap.put(5,new Character[]{'j','k','l'});
        lettersMap.put(6,new Character[]{'m','n','o'});
        lettersMap.put(7,new Character[]{'p','q','r','s'});
        lettersMap.put(8,new Character[]{'t','u','v'});
        lettersMap.put(9,new Character[]{'w','x','y','z'});

    }

    static class  FastReader{

        StringTokenizer st;
        BufferedReader br;


        FastReader(){

            br=new BufferedReader(new InputStreamReader(System.in));


        }

        String next(){
            while (st==null||!st.hasMoreTokens()) {
                try {


                    st = new StringTokenizer(br.readLine());

                } catch (Exception ex) {

                    ex.printStackTrace();

                }
            }

            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }




    }

    private static List<String> buildString(List<String> current,int combineWith){


        Character[] charArray=lettersMap.get(combineWith);
        List<String> res =new ArrayList<>();
        for (String cur:current) {

            for (char c:  charArray) {

                res.add(cur+c);

            }

        }

        return res;

    }

    public static void main (String[] args) {
        //code

        FastReader sc=new FastReader();

        int testCases=sc.nextInt();

        while (testCases-- > 0){



            int n=sc.nextInt();

            int[] arr=new int[n];
            for (int i = 0; i <n ; i++)
                arr[i]=sc.nextInt();


            Character[] charArray=lettersMap.get(arr[0]);
            List<String> res =new ArrayList<>();


            for (char c:  charArray)
                res.add(String.valueOf(c));


            for (int i = 1; i <n ; i++)
                res=buildString(res,arr[i]);



            StringBuilder sb=new StringBuilder();

            for (String s:res )
                sb.append(s).append(" ");


            System.out.println(sb.toString().trim());


        }


    }
}

package GFG.Strings;


//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0/?track=sp-strings&batchId=152
//https://www.youtube.com/watch?v=78t_yHuGg-0&t=24s  //Solution

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

public class PermutationsOfAGivenString {

    static SortedSet<String> lst;

        private static void  permutate(StringBuilder s,String choosen){

            if(s.length()<1)
                lst.add(choosen);

            else {

                for (int i = 0; i < s.length(); i++) {

                    char temp=s.charAt(i);

                    //choose
                    choosen+=temp;

                    s.deleteCharAt(i);

                    //explore
                    permutate(s,choosen);

                    choosen=choosen.substring(0,choosen.length()-1);
                    //Unchoose
                    s.insert(i,temp);

                }

            }

        }

        public static void main (String[] args) throws IOException {
            //code

            BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

            int testCases=Integer.parseInt(sc.readLine());

            while (testCases-- > 0){



                StringBuilder s=new StringBuilder(sc.readLine());
                int len=s.length();

                lst=new TreeSet<>();


               permutate(s,"");

                StringBuilder sb=new StringBuilder();

                Iterator<String> iterator = lst.iterator();


                while (iterator.hasNext())
                    sb.append(iterator.next()).append(" ");


                System.out.println(sb.toString().trim());



            }


        }
    }
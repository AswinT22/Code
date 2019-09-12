package Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class GFG {




    private static String longestPalindrome(char[] charArray){

        int len=charArray.length;
        char[] charArrayWithStar=new char[2*len+1];


        //pre-process by adding * in-between chars to handle even length
        for (int i = 0; i < 2*len+1; i++) {

            if(i%2!=0)
                charArrayWithStar[i]=charArray[i/2];
            else
                charArrayWithStar[i]='*';

        }

        int start=0;
        int end=0;
        int[] countArray=new int[charArrayWithStar.length];
        for (int i = 0; i < charArrayWithStar.length ;) {


            while (start>0 && end<charArrayWithStar.length-1&&charArrayWithStar[start-1]==charArrayWithStar[end+1]){

                --start;
                ++end;


            }

            countArray[i]=(end-start)+1;

            if(end ==countArray.length-1)
                break;

            int nextCenter=end+(i%2==0?1:0);



            for (int j = i+1; j <=end ; j++) {

                countArray[j]=Math.min(countArray[i-(j-i)],end-j+1);


                if(j+(countArray[i-(j-i)]/2)==end){



                    nextCenter=j;
                    break;
                }



            }
            i=nextCenter;
            start=nextCenter-countArray[nextCenter]/2;
             end=nextCenter+countArray[nextCenter]/2;


        }

        int maxIndex=0;

        for (int i = 1; i <countArray.length ; i++) {

            if(countArray[maxIndex]<countArray[i])
                maxIndex=i;

        }


        int lenofPalindrome=(countArray[maxIndex]-1)/2;
        int mid=(maxIndex-1)/2;

        start=mid-(lenofPalindrome/2);
        end=1+mid+(lenofPalindrome/2);

        if(maxIndex%2==0)

            ++start;










        return new String(charArray).substring(start,end);
    }

    public static void main (String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testCases=Integer.parseInt(br.readLine());


        while(testCases-->0){


            String str=br.readLine().trim();


            String res=longestPalindrome(str.toCharArray());


            System.out.println(res.length()>0?res:str.charAt(0));



        }





    }




}
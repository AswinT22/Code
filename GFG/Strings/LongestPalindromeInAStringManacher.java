package GFG.Strings;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindromeInAStringManacher {








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

            /**
             * Linear time Manacher's algorithm to find longest palindromic substring.
             * There are 4 cases to handle
             * Case 1 : Right side palindrome is totally contained under current palindrome. In this case do not consider this as center.
             * Case 2 : Current palindrome is proper suffix of input. Terminate the loop in this case. No better palindrom will be found on right.
             * Case 3 : Right side palindrome is proper suffix and its corresponding left side palindrome is proper prefix of current palindrome. Make largest such point as
             * next center.
             * Case 4 : Right side palindrome is proper suffix but its left corresponding palindrome is be beyond current palindrome. Do not consider this
             * as center because it will not extend at all.
             *
             * To handle even size palindromes replace input string with one containing $ between every input character and in start and end.
             *
             * Note: Right Side will always be a proper suffix (In case 3 and case 4),proper prefix means it should exactly till the start of the current palindrome
             */
            for (int i = 0; i < charArrayWithStar.length ;) {


                while (start>0 && end<charArrayWithStar.length-1&&charArrayWithStar[start-1]==charArrayWithStar[end+1]){

                    --start;
                    ++end;


                }

                countArray[i]=(end-start)+1;


                //Case 2
                if(end ==countArray.length-1)
                    break;

                int nextCenter=end+(i%2==0?1:0);



                for (int j = i+1; j <=end ; j++) {

                    //In Case 3 and 4 it is assigned till the current end, in Case 1 it will lesser than current end
                    countArray[j]=Math.min(countArray[i-(j-i)],end-j+1);

                    //Case 3 it will be equal to end, in Case 4 it will be greater than end and in Case 1 it will be lesser
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
            //Finding the max index
            for (int i = 1; i <countArray.length ; i++) {

                if(countArray[maxIndex]<countArray[i])
                    maxIndex=i;

            }


            int lenofPalindrome=(countArray[maxIndex]-1)/2; // lenOfLargest palindrome excluding the '*'

            //Finding the actual string
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

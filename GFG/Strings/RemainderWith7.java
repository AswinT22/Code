package GFG.Strings;
//https://practice.geeksforgeeks.org/problems/remainder-with-7/1/?track=sp-strings&batchId=152
import java.util.*;
class RemainderWith7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            String str = sc.nextLine();

            System.out.println(remainderWith7(str));
            t--;
        }
    }

    // Complete the function

    //this is a generic algorithm for finding remainder
    static int  remainderWith7(String num)
    {
        int m=7;//replace m with whatever you want divisor to be
        // Your code here
        long sum=0;

        for (int i = 0; i <num.length() ; i++) {

            if(sum>m)
                sum%=m;

            sum=(sum*10)+(num.charAt(i) -'0');  //Since we are getting a char(Char is already an integer internally represented in Ascii '0'-48 '1'-49 ... so on)
                                               // No matter whatever charAt gives it's converted to according integer by " - '0'"
                                              // 1-0=1 (49-48=1)



        }

        return (int)sum%m;
    }
}

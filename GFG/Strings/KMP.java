package GFG.Strings;

public class KMP {

    private static boolean findPattern(char[] str,char[] pattern){


        int[] trackingArray=new int[pattern.length];


            int j=0,i=1;

            while (i<pattern.length)
            {

                if(pattern[i]==pattern[j]){

                    trackingArray[i]=j+1;
                    ++i;
                    ++j;
                    continue;


                }

                else {

                    if(j==0){
                        ++i;
                        continue;
                    }

                     if(j-1>=0)
                         j=trackingArray[j-1];


                }



            }

            i=0;
            j=0;

            while (i<str.length && j<pattern.length){


                if(str[i]==pattern[j])
                {
                    ++i;
                    ++j;
                    continue;

                }else {

                    if(j==0){
                        ++i;
                        continue;
                    }

                    if(j-1>=0)
                        j=trackingArray[j-1];


                }




            }


        return j == pattern.length;


    }



    public static void main(String[] args) {


        String str="abxabcabcaby";
        String pattern="abcaby";

        if( findPattern(str.toCharArray(),pattern.toCharArray()))
            System.out.println("Found");
        else
            System.out.println("Not Found");


    }


}

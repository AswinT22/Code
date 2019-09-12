package Misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class QuickSort3PNTRP {

   // static Map<String,Boolean> sortedindexs=new HashMap<>();
    private static void quickSort(int[] a,int left, int right)
    {

        while(left<right)
        {
             int k=new Random().nextInt(right-left)+left;
           swap(a,k,left);
            int[] m=partition(a,left,right);

           // sortedindexs.put(m[0]+","+m[1],true);

            if(m[0]-left < right-m[1])
            {
               // if (sortedindexs.containsKey(left+","+m[0])) return;


                quickSort(a,left,m[0]);
                left=m[1];

            }
            else {

                //if (sortedindexs.containsKey(m[1]+","+right)) return;
                quickSort(a,m[1],right);
                right=m[0];

            }



        }




    }

    private static int[] partition(int a[],int left,int right){


        int X=a[left],posPiv=left,j=left;

        for (int i = left+1; i < right; i++) {

            if(X> a[i])
            {
                ++j;
                swap(a,i,j);
            }
            else if (X==a[i]){
                ++j;
                ++posPiv;

                if (posPiv!=i){


                    swap(a,posPiv,i);
                    if(posPiv!=j)
                        swap(a,i,j);
                }
            }
        }

        if(posPiv!=left)
            for (int k = 0; k < j-posPiv ; k++) {

                swap(a,left+k,posPiv+1+k);
            }
        else
            swap(a,left,j);

        return new int[]{j-(posPiv-left),j+1};

    }


    private static  void swap(int[]a, int pos1,int pos2){


        if(pos1!=pos2){

            int temp=a[pos1];
            a[pos1]=a[pos2];
            a[pos2]=temp;


        }

    }

    public static void main(String[] args) {

        //Stress Test

        Random rand=new Random();
        int n = 99999999;//rand.nextInt(999999) + 2;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            //Generates numbers from 1 to 100000
            arr[i] = rand.nextInt(9999999) + 1;

        }

        // int[] arr={5,4,31,2,1,10,9,8,7,6};
        //int[] arr={5,5,52,3,2,1,3,5,1,2,2,7,8,9,10};

        long startTime = System.currentTimeMillis();
        quickSort(arr,0,arr.length);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;



       // Arrays.stream(arr).forEach(System.out::println);
        System.out.println ("Number:"+n);
        System.out.println("Seconds time  "+totalTime/1000d);
    }
}

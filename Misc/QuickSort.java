package Misc;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {


    private static int partition(int[] arr,int l,int r) {
        Random rand=new Random();


       // int index=rand.nextInt(r)+l;
        //int x=arr[index];
        //int j=index;
        int x = arr[l];
        int j = l;
        for (int i = l + 1; i < r; i++)
            if (arr[i] <= x) {
                j++;
                swap(arr,i,j);
            }

            swap(arr,j,l);


        return j;

    }
    private static void swap(int[]arr,int pos1,int pos2){

        if(pos1!=pos2){
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;

        }

    }

    private static void quickSort(int[]arr,int l,int r){


        if(l>=r)
            return;
        int m=partition(arr,l,r);

        quickSort(arr,l,m);
        quickSort(arr,m+1,r);

    }

    public static void main(String[] args) {

        //Stress Test

//        Random rand=new Random();
//        int n = rand.nextInt(100) + 2;
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//
//            //Generates numbers from 1 to 100000
//            arr[i] = rand.nextInt(10) + 1;
//
//        }

      //int[] arr={5,4,3,2,1,10,9,8,7,6};
       int[] arr={5,5,52,3,2,1,3,5,1,2,2,7,8,9,10};
       // Courses.Algorithmic_ToolBox.Week4.MajorityElement.quickSort(arr,0,arr.length);

        Arrays.stream(arr).forEach(System.out::println);

    }
}

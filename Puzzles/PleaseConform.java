package Puzzles;

import java.util.Random;

public class  PleaseConform{

    public static void main(String[] args) {
        int n = 30;
        // 'F' indicates the forward cap position and 'B' indicates backward cap position
        char[] points = {'F', 'B'};
        char[] input = new char[n];


        // Making sure we keep the last pos free for pre-processing
        for (int i = 0; i < n - 1; i++) {

            //Filling the array randomly with 'F' and 'B'
            input[i] = points[new Random().nextInt(points.length)];

            System.out.print(input[i] + " ");
        }

        System.out.println();
        input[n-1]=input[0]; //pre-processing
        pleaseConformOnepass(input);
    }


      public static void pleaseConformOnepass(char[] input){

        int n=input.length;


        for (int i = 1; i <input.length ; i++) {

            if(input[i]!= input[i-1])
                if (input[i]!=input[0])
                    System.out.print("Flip the caps from "+i);
                else
                    System.out.println(" through "+(i-1));

        }

    }


}
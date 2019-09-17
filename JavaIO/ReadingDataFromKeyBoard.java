package JavaIO;


import java.io.*;

import java.util.Scanner;

//InputStreamReader class
//  InputStreamReader class can be used to read data from keyboard.It performs two tasks:
//      connects to input stream of keyboard
//      converts the byte-oriented stream into character-oriented stream



//BufferedReader class
//      BufferedReader class can be used to read data line by line by readLine() method.
//public class ReadingDataFromKeyBoard {
//
//
//    public static void main(String args[])throws Exception{
//
//        InputStreamReader r=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(r);
//
//        System.out.println("Enter your name");
//        String name=br.readLine();
//        System.out.println("Welcome "+name);
//
//
//
//    }
//}

//Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings.
// It is the easiest way to read input in a Java program, though not very efficient

public class ReadingDataFromKeyBoard {
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        // String input
        String name = sc.nextLine();
        System.out.println("Welcome "+name);
    }
}
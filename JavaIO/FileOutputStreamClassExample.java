package JavaIO;

//public class FileOutputStream extends OutputStream
//To write primitive values into a file, use FileOutputStream class.
//You can write byte-oriented as well as character-oriented data through FileOutputStream class.
//But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.




//write byte

import java.io.FileOutputStream;
public class FileOutputStreamClassExample {
    public static void main(String[] args){
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}


//void write()	It is used to write the specified byte to the file output stream.




//write string

//public class FileOutputStreamExample {
//    public static void main(String args[]){
//        try{
//            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
//            String s="Welcome to javaTpoint.";
//            byte b[]=s.getBytes();//converting string into byte array
//            fout.write(b);
//            fout.close();
//            System.out.println("success...");
//        }catch(Exception e){System.out.println(e);}
//    }
//}
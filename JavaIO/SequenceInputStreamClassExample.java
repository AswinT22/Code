package JavaIO;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

//public class SequenceInputStream extends InputStream
//Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).



// we are printing the data of two files testin.txt and testout.txt.
//
//
//public class SequenceInputStreamClassExample {
//
//    public static void main(String args[])throws Exception{
//        FileInputStream input1=new FileInputStream("D:\\testin.txt");
//        FileInputStream input2=new FileInputStream("D:\\testout.txt");
//        SequenceInputStream inst=new SequenceInputStream(input1, input2);
//        int j;
//        while((j=inst.read())!=-1){
//            System.out.print((char)j);
//        }
//        inst.close();
//        input1.close();
//        input2.close();
//    }
//}



//we are writing the data of two files testin1.txt and testin2.txt into another file named testout.txt
//
//public class SequenceInputStreamClassExample {
//
//    public static void main(String args[])throws Exception{
//        FileInputStream fin1=new FileInputStream("D:\\testin1.txt");
//        FileInputStream fin2=new FileInputStream("D:\\testin2.txt");
//        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
//        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
//        int i;
//        while((i=sis.read())!=-1)
//        {
//            fout.write(i);
//        }
//        sis.close();
//        fout.close();
//        fin1.close();
//        fin2.close();
//        System.out.println("Success..");
//    }
//}


//If we need to read the data from more than two files, we need to use Enumeration.
//Enumeration object can be obtained by calling elements() method of the Vector class.
//here we are reading the data from 4 files: a.txt, b.txt, c.txt and d.txt.


public class SequenceInputStreamClassExample {

    public static void main(String[] args)throws IOException{
//creating the FileInputStream objects for all the files
        FileInputStream fin=new FileInputStream("D:\\a.txt");
        FileInputStream fin2=new FileInputStream("D:\\b.txt");
        FileInputStream fin3=new FileInputStream("D:\\c.txt");
        FileInputStream fin4=new FileInputStream("D:\\d.txt");
//creating Vector object to all the stream
        Vector v=new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
//creating enumeration object by calling the elements method
            Enumeration e=v.elements();
//passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }
}
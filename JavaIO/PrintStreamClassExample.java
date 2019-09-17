package JavaIO;
import java.io.FileOutputStream;
import java.io.PrintStream;



//public class PrintStream extends FilterOutputStream implements Closeable. Appendable
//
//The PrintStream class provides methods to write data to another stream.
//The PrintStream class automatically flushes the data so there is no need to call flush() method.
//Moreover, its methods don't throw IOException.
public class PrintStreamClassExample {


    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt ");
        PrintStream pout=new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success!");



        int a=19;
        //using printf() method of java.io.PrintStream class.
        System.out.printf("%d",a); //Note: out is the object of printstream
    }
}

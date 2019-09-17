package JavaIO;

import java.io.*;

public class RedingAndWritingSimultaneously {

    public static void main(String[] args) throws IOException{
        File f = new File("D:\\testout.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        BufferedReader br = new BufferedReader(new  FileReader(f));
        bw.write("Some text");
        bw.flush();
        System.out.println(br.readLine());
        bw.write("Some more text");
        bw.flush();
        bw.close();
        br.close();
    }
}

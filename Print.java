import java.io.*;
import java.util.*;
public class Print
{
    public static void main(String[] args)throws IOException
    {
        PrintWriter pw=new PrintWriter(new FileWriter("A.txt"));
        for(int i=0;i<10;i++)
            pw.write(String.valueOf(i));
        pw.flush();
        pw.close();
    }
}
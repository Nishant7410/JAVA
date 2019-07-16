import java.io.*;
import java.util.*;
public class Filereader
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader pw=new BufferedReader(new FileReader("A.txt"));
       while(true)
       {
           int x=pw.read();
           if(x==-1)
               break;
           System.out.print((char)x);
       }
        pw.close();
    }
}
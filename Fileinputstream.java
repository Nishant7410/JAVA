import java.io.*;
import java.util.*;
public class Fileinputstream
{
    public static void main(String ar[])throws IOException
    {
        InputStreamReader f=new InputStreamReader(System.in);
        int x;
        while((x=f.read())!=-1)
        {
            System.out.print((char)x);
        }
    }
}
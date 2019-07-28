import java.lang.*;
import java.io.*;
public class FileOutputstream
{
public static void main(String a[])throws IOException
{
FileOutputStream f=new FileOutputStream("fileOutputstream.txt");
f.write('t');
f.close();
}
}
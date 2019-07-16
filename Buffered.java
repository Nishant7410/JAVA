import java.io.*;
import java.util.*;
class stu
{
    int a,b;
    void read() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.print(a+b);
    }
}
public class Buffered
{
    public static void main(String[] args) throws IOException
    {
        stu s=new stu();
        s.read();
    }
}

import java.util.Scanner;
import java.io.*;
public class Htmltags{
    public static void main(String[] args)
    {
      try{
        FileInputStream obj=new FileInputStream("Html.txt");
        BufferedInputStream re=new BufferedInputStream(obj);
        String data=new String();
        while(re.available()>0)
        {
          data=data+(char)re.read();
        }
        int key=1;
        for(int i=0;i<data.length();i++)
        {
        
          if(data.charAt(i)=='<')key=0;
          if(data.charAt(i)=='>')key=1;
          else
          if(key==1)System.out.print(data.charAt(i));
        }
      }
      catch(Exception e){}
    }
}
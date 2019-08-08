import java.util.*;
import java.lang.*;
public class Email
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    if(str.matches("^(.+)@(.+)\\.(.+)"))
        System.out.println("Valid");
        else
          System.out.println("Invalid");
    }
}
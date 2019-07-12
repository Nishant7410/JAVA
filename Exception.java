import java.util.*;
public class Exception
{
public static void main(String[] args)
{
int c,a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.print("error");
}
}
}
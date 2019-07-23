abstract class A
{
    public void fun()
    {}
   final void fun1(){}
}
public class Abs extends A
{

public void hello()
{
System.out.println("hii");
}
    public static void main(String ar[])
    {
     
     Abs s=new Abs();
     s.hello();
    }
}
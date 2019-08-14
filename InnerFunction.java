public class InnerFunction
{
    public void fun1()
    {
        System.out.println("hiii");
    }
    public void fun()
    {
        fun1();
    }
    public static void main(String a[])
    {
        Outer n1=new Outer();
        n1.fun();
        
    }
}
class Base
{
    Base()
    {
        System.out.println("base");
    }
}
public class Inheritence extends Base
{
    Inheritence()
    {
        System.out.println("derived");
    }
    public static void main(String ar[])
    {
      Inheritence in=new Inheritence();
    }
}
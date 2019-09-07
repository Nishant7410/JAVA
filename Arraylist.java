import java.util.*;
public class Arraylist
{
    public static void fun(ArrayList<Integer>al)
    {
        al.add(1);
        al.add(2);
        al.add(3);
    }
    public static void main(String ar[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        fun(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
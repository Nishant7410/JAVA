import java.util.*;
import java.lang.*;
public class Stack1
{
    public static void main(String ar[])
    {
       Scanner sc=new Scanner(System.in);
       int a;
       Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<3;i++)
        {
            a=sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
    }
}
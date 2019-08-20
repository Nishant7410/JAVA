import java.util.*;
public class Permautation
{
    public static void permautation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        boolean alpha[]=new boolean[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            if(alpha[ch-'a']==false)
                permautation(res,ans+ch);
            alpha[ch-'a']=true;
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.next();
        permautation(str,"");
    }
}
import java.util.*;
public class Space
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int f=0;
        int k=-1,c=0;
        int first=0,last=0;
        int length=ch.length;
        for(int i=0;i<=length;i++)
        {
           if(i==length||ch[i]==32)
           {
               if(f==1)
               {
                 f=0;
                 last=i-1;
                 for(int j=first;j<=last;j++)
                    ch[++k]=ch[j]; 
               }
           }
            else
            {
                if(f==0)
                {
                    f=1;
                    first=i;
                    if(c!=0)
                    ch[++k]=' ';
                    c++;
                }
            }
        }
        for(int i=0;i<=k;i++)
        System.out.print(ch[i]);
    }
}
    
import java.util.*;
public class Knapsack
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int p[]=new int[7];
        int w[]=new int[7];
        for(int i=0;i<7;i++)
            p[i]=sc.nextInt();
        for(int i=0;i<7;i++)
            w[i]=sc.nextInt();
        int c=sc.nextInt();
        float max,sum=0;
        int m=c,j=0;
        while(m>0)
        {
            max=0;
            for(int i=0;i<7;i++)
            {
                if(((float)p[i])/((float)w[i])>max)
                {
                    max=((float)p[i])/((float)w[i]);
                    j=i;
                }
            }
            if(w[j]>m)
            {
                sum+=(float)m*max;
                m=0;
            }
            else
            {
                m-=w[j];
                sum+=(float)p[j];
                p[j]=0;
            }
        }
        System.out.print(sum);
    }
}
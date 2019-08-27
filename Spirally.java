import java.util.*;
public class Spirally
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[][]=new int[2*n-1][2*n-1];
        int k=0,l=0;
        int row=2*n-2;
        int col=2*n-2;
        int m=n;
        while(k<=row&&l<=col)
        {
            for(int i=k;i<=col;i++)
                ar[k][i]=n;
            k++;
            for(int i=k;i<=row;i++)
                ar[i][col]=n;
            col--;
            if(k<=row)
            {
                for(int i=col;i>=l;i--)
                    ar[row][i]=n;
            }
            row--;
            if(l<=col)
            {
                for(int i=row;i>=k;i--)
                    ar[i][l]=n;
            }
            l++;
            n--;
        }
        for(int i=0;i<2*m-1;i++)
        {
            for(int j=0;j<2*m-1;j++)
           System.out.print(ar[i][j]);
            System.out.println();
        }
    }
}
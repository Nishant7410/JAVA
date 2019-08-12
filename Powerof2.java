import java.util.*;
public class Powerof2
{
    public static void main(String a[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int t=(n<<3)-n;
        System.out.print(t);
    }
}
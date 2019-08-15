import java.util.*;
public class Multipleof7
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
         n=(n<<3)-n;
        System.out.println(n);
    }
}
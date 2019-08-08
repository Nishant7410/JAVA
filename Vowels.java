public class Vowels
{
    public static void main(String ar[])
    {
        StringBuilder str=new StringBuilder("sachin");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                str.deleteCharAt(i);
            i--;
            }   
        }
        System.out.println(str);
    }
}
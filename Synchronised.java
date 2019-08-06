import java.lang.*;
class Buffer
{
    int n;
    Buffer()
    {
        n=0;
    }
    void display()
    {
        n++;
        System.out.println("Thread: "+n);

    }
}
class ThreadDemo extends Thread
{
Buffer b;
ThreadDemo(Buffer b)
{
this.b=b;
start();
}
public void run()
{
b.display();
}
}
public class Synchronised
{
    public static void main(String ar[])
    {
        Buffer c=new Buffer();
        ThreadDemo t1=new ThreadDemo(c);
        ThreadDemo t2=new ThreadDemo(c);
    }
}
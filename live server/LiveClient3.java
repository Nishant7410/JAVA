import java.net.*;
import java.io.*;
public class LiveClient3 implements Runnable
{
    int clientport=40,serverport=20;
    DatagramSocket ds;
    Thread recThread;
    BufferedReader br;
   public LiveClient3()throws IOException
    {
        ds=new DatagramSocket(clientport);
         br=new BufferedReader(new InputStreamReader(System.in));
         String name=br.readLine();
         name="add "+name;
         DatagramPacket dp=new DatagramPacket(name.getBytes(),name.length(),InetAddress.getLocalHost(),serverport);
         ds.send(dp);
        recThread=new Thread(this);
        recThread.start();
        sends();
    }
    public void sends() throws IOException
    {
      br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            String data=br.readLine();
            if(data.equals("EXIT"))
                break;
            DatagramPacket dp=new DatagramPacket(data.getBytes(),data.length(),InetAddress.getLocalHost(),serverport);
            ds.send(dp);
        }
        ds.close();
    }
    public void run()
    {
        byte b[]=new byte[1000];
        while(true)
        {
            try
            {
            DatagramPacket dp=new DatagramPacket(b,b.length);
            ds.receive(dp);
            String data=new String(b,0,dp.getLength());
            System.out.println("Server:"+data);
            }
            catch(Exception e)
            {
                
            }
        }
    
    }
    public static void main(String ar[]) throws IOException
    {
        new LiveClient3();
    }
}
// server class
// 6666 is socket number on which server is working
// total clients 3 allowed or 3 requests
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class server
{
	public static void main(String[] args)
	{
		try
		{
			int count = 0;
			ServerSocket listen = new ServerSocket(8888);
			System.out.println("how many requests you want to serve\n");
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			while(true)
			{	
				Socket MyServer = listen.accept();
				DataInputStream inp = new DataInputStream(MyServer.getInputStream());
				String str = (String)inp.readUTF();
				System.out.println("message ==" + str);
				System.out.println(count);
				count++;
				if(count == a)
				{
					listen.close();
					break;
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
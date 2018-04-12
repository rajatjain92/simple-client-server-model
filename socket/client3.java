// client3 class
// localhost means this computer
// 6666 is port number on which server is working

import java.net.*;
import java.io.*;

public class client3
{
	public static void main(String[] args)
	{
		Socket MyClient;
		try
		{
			MyClient = new Socket("localhost",8888);
			DataOutputStream out = new DataOutputStream(MyClient.getOutputStream());
			out.writeUTF("i am client 3");
			out.flush();
			out.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

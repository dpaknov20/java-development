
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;

public class solution2 
{
	public static void main(String args[]) throws Exception
    {
		//program for checking the connectivity
		while(true)
		{
			boolean connectivity;
        try {
        URL url = new URL("http://google.com/");
        URLConnection conn = url.openConnection();
        conn.connect();
        connectivity=true;
        System.out.println("System has internet access");
        } catch (Exception e) {
        	connectivity=false;
        System.out.println("Not connected to internet");
        }
        
    	 // Returns the instance of InetAddress containing
        // local host name and address
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("System IP Address : " +
                      (localhost.getHostAddress()).trim());
        // Find public IP address
        String systemipaddress = "";
        try
        {
            URL url_name = new URL("http://bot.whatismyipaddress.com");
 
            BufferedReader sc =
            new BufferedReader(new InputStreamReader(url_name.openStream()));
 
            // reads system IPAddress
            systemipaddress = sc.readLine().trim();
        }
        catch (Exception e)
        {
            systemipaddress = "Couldn't connect to internet";
        }
        System.out.println("Public IP Address: " + systemipaddress +"\n");
        Thread.sleep(7000);        // thread not working for 5 seconds
		}
    }
}



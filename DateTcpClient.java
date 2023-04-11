import java.util.*;
import java.io.*;
import java.net.*;

public class DateTcpClient {
	public static void main(String[] args) throws Exception {
		try {
		Socket s = new Socket("localhost",3333);
		Scanner sc = new Scanner(System.in);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String str = "Give Today's Date";
		dout.writeUTF(str);
		s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
		
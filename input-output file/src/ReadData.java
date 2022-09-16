import java.io.*;

public class ReadData {
	public static void main(String[] args) {
		try {
			FileInputStream ds=new FileInputStream("aa.txt");
			DataInputStream dr= new DataInputStream(ds);
			String str=dr.readLine();
			while(str!=null) {
				System.out.println(str);
				str=dr.readLine();
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}

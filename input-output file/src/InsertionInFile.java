import java.io.*;

public class InsertionInFile {
	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("aa.txt",true);
			PrintStream ps=new PrintStream(fs);
			ps.println("Welcome to this file");
			ps.println("This is the content of this file");
			System.setOut(ps);
			System.out.println("This PrintStream will store the data into the file not in the console");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}

import java.net.*;

public class ServerSide {
	private Socket server;
	public ServerSide() {
		ServerSocket soc;
		System.out.println("Server created......");
		try {
			soc=new ServerSocket(2002);
			while(true) {
				server=soc.accept();
				System.out.println("Client connected.....");
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
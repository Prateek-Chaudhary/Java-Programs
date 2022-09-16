import java.net.*;

class ClientSide {
	private Socket soc;
	public ClientSide(String address, int port) {
		try {
			soc=new Socket(address,port);
			System.out.println("Client created.....");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		new ClientSide("localhost",2002);
	}
}
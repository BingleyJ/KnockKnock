import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class JokeServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket listener = new ServerSocket(9090);
		 try {
	            while (true) {
	                Socket socket = listener.accept();
	                try {
	                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	                    out.println("Uhm, I think your connected eh.");
	                } finally {
	                    socket.close();
	                }
	            }
	        }
	        finally {
	            listener.close();
	        }

	}

}

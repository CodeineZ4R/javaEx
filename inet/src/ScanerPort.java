import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by admin on 30.09.2017.
 */
public class ScanerPort {
    public void scanner(String inetAddress,int start ,int finish) {
        for (int port = start; port <= finish; port++)
            try {
                Socket socket = new Socket();

                socket.connect(new InetSocketAddress(inetAddress, port), 1000);
                socket.close();
                System.out.println("Port " + port + " is open");
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }
}


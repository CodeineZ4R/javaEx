import java.net.InetAddress;


/**
 * Created by admin on 30.09.2017.
 */
public class PingReachable {

    public void hostReachable(String string) {
        try {
            String ipAddress = string;
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            if (inet.isReachable(5000)) {
                System.out.println(ipAddress + " is reachable.");

            } else {
                System.out.println(ipAddress + " NOT reachable.");
            }
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}



/**
 * Created by admin on 30.09.2017.
 */
public class PingIp {
    public static void main(String[] args) {
        PingReachable pingReachable = new PingReachable();
        PingTTL pingTTL = new PingTTL();

        String string = "---------------------------";
        System.out.printf("%s   %s   %s","min","max","average");
        System.out.println();
        System.out.println(string);

        pingTTL.runSystemCommand("ping", "8.8.8.8" );
        pingTTL.runSystemCommand("ping", "127.0.0.1" );
        pingTTL.runSystemCommand("ping", "192.168.0.1" );
        pingTTL.runSystemCommand("ping", "oldschool44.runescape.com" );

    }
}

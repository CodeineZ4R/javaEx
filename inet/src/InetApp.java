/**
 * Created by admin on 30.09.2017.
 */
public class InetApp {
    public static void main(String[] args) {
        ScanerPort scanerPort = new ScanerPort();
        scanerPort.scanner("localhost", 100 , 120);
    }
}

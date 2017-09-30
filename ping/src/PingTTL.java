import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Created by admin on 30.09.2017.
 */
public class PingTTL {

    public static void runSystemCommand(String command, String ipAdress) {

        try {
            Process p = Runtime.getRuntime().exec(command+" "+ipAdress);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            int numString = 0;
            while ((s = inputStream.readLine()) != null) {
                numString++;
                if (numString == 12) {

                    for (String str : s.split(" ")) {
                        if ( !(str.length() == 0) &&Character.isDigit(str.charAt(0))){
                            String strformat  = "";
                            for (Character c : str.toCharArray()){
                                if ( Character.isDigit(c)) {
                                    strformat = strformat + c;
                                }
                            }
                            System.out.printf("%s \t",strformat);

                        }
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }


}

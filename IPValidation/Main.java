/*
    Validate an IP address. A valid IPv4 address must be
    in the form of xxx.xxx.xxx.xxx, where xxx is a number from 0-255
 */

public class Main {
    private static boolean validateIP(String ip) {
        String[] splitIP = ip.split("\\.");
        if (splitIP.length != 4) {
            return false;
        }

        for (String part: splitIP) {
            try {
                int number = Integer.valueOf(part);
                if (number < 0 || number > 255) {
                    return false;
                }
            } catch (java.lang.NumberFormatException exception) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ip = "255.255.255.255";
        System.out.println(validateIP(ip));
    }
}

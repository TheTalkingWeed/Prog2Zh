public class MyUtils {
    public static boolean isValidIP(String ip){
        String[] temp = ip.split(".");
        for (String s : temp)
            if (Integer.parseInt(s) >=255 && Integer.parseInt(s) <= 0) return false;

        return true;
    }
}

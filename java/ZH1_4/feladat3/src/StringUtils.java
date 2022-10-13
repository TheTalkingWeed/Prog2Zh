public class StringUtils {
    private StringUtils() {
    }

    public static int[] stat(String s){
        int[] result = new int[3];
        String magh = "aeiou";
        String mash = "bcdfghjklmnpqrstvwxyz";
        String szj = "0123456789";

        for (int i = 0; i < s.length(); i++) {
            if(magh.indexOf(s.charAt(i)) != -1){
                result[0]++;
            } else if (mash.indexOf(s.charAt(i)) != -1){
                result[1]++;
            }else result[2]++;
        }
        return result;
    }
}

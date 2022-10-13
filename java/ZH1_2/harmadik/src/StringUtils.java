public class StringUtils {
    public static String isPangram(String s){
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
                if ( temp.indexOf(Character.toString(s.charAt(i))) == -1)
                    temp.append(s.charAt(i));

            return temp.length() >= 26 ? "A  fenti szöveg pangram!":"A fenti szöveg nem pangram!";
    }
}

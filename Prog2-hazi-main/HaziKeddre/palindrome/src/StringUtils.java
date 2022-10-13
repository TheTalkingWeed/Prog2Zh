public class StringUtils {
    public static boolean isPalindrome(String s){


        return s.equals(reverse(s));
    }

    public static String reverse(String s){
        StringBuilder output = new StringBuilder();

        for (int i=s.length()-1;i>=0; i--){
            output.append(s.charAt(i));
        }

        return output.toString();
    }

}

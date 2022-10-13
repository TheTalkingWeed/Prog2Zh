import java.security.cert.TrustAnchor;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Input: ");
            String input = sc.nextLine();
            System.out.println("Output: "+removeLetter(input));
        }
    }


    private static String removeLetter(String s){
        StringBuilder output = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || output.indexOf(Character.toString(s.charAt(i))) == -1){
                output.append(s.charAt(i));
            }else{
                if (s.charAt(i) == ' ' || !temp.toString().contains(Character.toString(s.charAt(i))))
                    temp.append(s.charAt(i));
            }
        }
        System.out.println(temp);
        return removeDifferent(output.toString(),temp.toString());
    }

    private static String removeDifferent(String firstString,String secondString){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++)
            if (!secondString.contains(Character.toString(firstString.charAt(i))))
                output.append(firstString.charAt(i));


        return output.toString();
    }
}

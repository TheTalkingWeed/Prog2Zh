import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> szavak = new ArrayList<>(FileUtils.readLines("words_alpha.txt"));
        int palindromszam=0;
        for (String e:szavak ) {
            if (StringUtils.isPalindrome(e)) palindromszam++;
        }
        System.out.println(palindromszam);
    }
}

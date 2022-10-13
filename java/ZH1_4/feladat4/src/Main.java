import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.readLines("ips.txt"));
        int res = 0;
        for (String s : inputFromFile)
            res += MyUtils.isValidIP(s) ? 1 : 0;


        System.out.println(res);
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.readLines("primes.php"));
        List<String> outputForFile = new ArrayList<>();
        String temp ;
        System.out.println("primes.php beolvasva");
        for (String s : inputFromFile) {
            if (s.indexOf("=>") > -1) {
                temp = s.split("=> ")[1].split(",")[0];
                if (temp.equals(reverse(temp)))
                    outputForFile.add(temp);
            }
        }
        FileUtils.writeLines("output.txt", outputForFile);
        System.out.println("output.txt letrehozva");

    }

    private static String reverse(String s){
        String output = "";

        for (int i=0; i<s.length(); i++)
            output= s.charAt(i)+output;


        return output;
    }
}

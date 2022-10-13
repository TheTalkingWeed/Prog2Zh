import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> inputFromFile = new ArrayList<>(beolvas("numbers.txt"));
        List<Integer> numbers = new ArrayList<>();
        for (String s:inputFromFile)
            numbers.add(numsSum(s));

        int max = 0;
        for (Integer i: numbers)
            if (i > max) max = i;

        int min = max;
        for (Integer i: numbers)
            if (i < min) min = i;

        System.out.println("A legkisseb összeg ("+min+") az "+(numbers.indexOf(min)+1)+". sorban található");
        System.out.println("A legnagyobb összeg ("+max+") az "+(numbers.indexOf(max)+1)+". sorban található");
    }

    private static int numsSum(String numbers){
        int result = 0;
        String[] temp = numbers.split(" ");
        for (String s:temp) {
            result += Integer.parseInt(s);
        }
        return result;
    }

    private static List<String> beolvas(String filename) throws IOException{
        List<String> output = new ArrayList<>();

            String line;
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null)
            {
                output.add(line);
            }
            br.close();

        return output;
    }
}

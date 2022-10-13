import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> input = new ArrayList<>(inputFromFile("dobozok.txt"));
        String[] temp;
        int sum = 0;
        int w,h,l;
        for (String s : input) {
            temp = s.split("x");
            w = Integer.parseInt(temp[0]);
            h = Integer.parseInt(temp[1]);
            l = Integer.parseInt(temp[2]);
            sum += 2 * l * w + 2 * w * h + 2 * h * l;
        }

        System.out.println(String.format("%d m^2",sum));
    }

    private static List<String> inputFromFile(String fileName) throws IOException {
        List<String> output = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null){

            output.add(line);
        }
        br.close();
        return output;
    }
}

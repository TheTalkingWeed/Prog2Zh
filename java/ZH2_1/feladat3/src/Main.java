import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.readLines("input.txt"));
        int depthPos = 0;
        int pos = 0;
        String[] temp;
        for (String s : inputFromFile) {
            temp = s.split(" ");

            switch (temp[0]){
                case "forward":
                    pos += Integer.parseInt(temp[1]);
                case "down":
                    depthPos -= Integer.parseInt(temp[1]);
                case "up":
                    depthPos += Integer.parseInt(temp[1]);

            }

        }

        System.out.printf("vizszintes pozició: %d%n",pos);
        System.out.printf("mélység: %d%n",depthPos);
        System.out.printf("vegeredmeny: %d",depthPos*pos);
    }

}

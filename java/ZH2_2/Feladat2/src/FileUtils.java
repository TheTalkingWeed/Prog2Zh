import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> beolvas(String filename){
        List<String> output = new ArrayList<>();
        try {

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line= br.readLine())!=null){
                output.add(line);
            }
            br.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }
            return output;
    }
}

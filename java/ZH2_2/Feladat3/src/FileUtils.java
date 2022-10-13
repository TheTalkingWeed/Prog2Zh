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

    public static void beir(String filename,List<List<String>> s){
        try {
            //        Veterán: 1920-1939
//        Baby boomer: 1940-1959
//        X: 1960-1983
//        Y: 1984-1994
//        Z: 1995-2009
//        Alfa: 2010-2012
            String[] seged={"Veteran","Baby boomer","X","Y","Z","Alfa"};
            int index=0;
            FileWriter file= new FileWriter(filename,false);
            BufferedWriter bw = new BufferedWriter(file);
            for (List<String> e:s) {
                bw.write(seged[index]+": ");
                for (String temp :e) {
                    bw.write(temp+", ");
                }
                index++;
                bw.newLine();
            }
            bw.newLine();
            bw.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

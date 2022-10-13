import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static int readLines(String fileName)
    {
        String output="";

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                line=line.replaceAll("_","");
                output=line;

            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        return Integer.parseInt(output);
    }
}

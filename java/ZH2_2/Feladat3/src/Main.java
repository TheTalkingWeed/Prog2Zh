import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.beolvas("felmeres.txt"));
        Map<String,List<String>> gen = new HashMap<>();
        int ev;
        String nev;
        gen.put("Veteran",new ArrayList<>());
        gen.put("Baby boomer",new ArrayList<>());
        gen.put("X",new ArrayList<>());
        gen.put("Y",new ArrayList<>());
        gen.put("Z",new ArrayList<>());
        gen.put("Alfa",new ArrayList<>());










        for (String s : inputFromFile) {
            ev = Integer.parseInt(s.split(" ")[1]);
            nev = s.split(" ")[0];
            if ( ev >= 1920 && ev <= 1939) gen.get("Veteran").add(nev);
            if ( ev >= 1940 && ev <= 1959) gen.get("Baby boomer").add(nev);
            if ( ev >= 1960 && ev <= 1983) gen.get("X").add(nev);
            if ( ev >= 1984 && ev <= 1994) gen.get("Y").add(nev);
            if ( ev >= 1995 && ev <= 2009) gen.get("Z").add(nev);
            if ( ev >= 2010 && ev <= 2012) gen.get("Alfa").add(nev);
            
        }


       FileUtils.beir("generaciok.txt",gen);


    }
}

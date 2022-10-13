
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
    public static void main(String[] args) {
        List<String> input=new ArrayList<>(FileUtils.beolvas("felmeres.txt"));
        List<String> veteran = new ArrayList<>();
        List<String> babyboomer = new ArrayList<>();
        List<String> xgen = new ArrayList<>();
        List<String> ygen = new ArrayList<>();
        List<String> zgen = new ArrayList<>();
        List<String> alfa = new ArrayList<>();

        List<List<String>> generaciok = new ArrayList<>();


        Map<String,Integer> felhasznalok= new HashMap<>();
        String[] seged;
        for (String e:input){
            seged=e.split(" ");
            felhasznalok.put(seged[0],Integer.parseInt(seged[1]));

            if (Integer.parseInt(seged[1])>=1920 && Integer.parseInt(seged[1])<=1939) veteran.add(seged[0]);
            if (Integer.parseInt(seged[1])>=1940 && Integer.parseInt(seged[1])<=1959) babyboomer.add(seged[0]);
            if (Integer.parseInt(seged[1])>=1960 && Integer.parseInt(seged[1])<=1983) xgen.add(seged[0]);
            if (Integer.parseInt(seged[1])>=1984 && Integer.parseInt(seged[1])<=1994) ygen.add(seged[0]);
            if (Integer.parseInt(seged[1])>=1995 && Integer.parseInt(seged[1])<=2009) zgen.add(seged[0]);
            if (Integer.parseInt(seged[1])>=2010 && Integer.parseInt(seged[1])<=2012) alfa.add(seged[0]);
        }

        generaciok.add(veteran);
        generaciok.add(babyboomer);
        generaciok.add(xgen);
        generaciok.add(ygen);
        generaciok.add(zgen);
        generaciok.add(alfa);


        FileUtils.beir("generaciok.txt",generaciok);






    }
}

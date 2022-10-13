import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> meresiadatok= new ArrayList<>(FileUtils.beolvas("betegek.txt"));
        for (String e:meresiadatok) checkSaturation(e);
    }

    public static void checkSaturation(String s){
        String[] seged=s.split(";");
        String[] szamok=seged[1].split(",");
        int alatt=0;
        for (String e : szamok){
            if(Integer.parseInt(e)< 95) {
                alatt++;
            }
        }
        if (alatt>=3) {
            System.out.println(seged[0]+" sürgős ellátásra szorul!");
        } else System.out.println(seged[0]+" állapota jó!");

    }
}

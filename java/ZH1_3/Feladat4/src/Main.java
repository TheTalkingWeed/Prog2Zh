import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<String> szamok=new ArrayList<String>(FileUtils.readLines("src\\tablazat.txt"));
            String[] seged;
            int max;
            int min;
            int osszeg=0;
            for(String a: szamok){
                max=0;
                seged=a.split("\\s+");

                for(int i=0;i< seged.length;i++){
                    if(Integer.parseInt(seged[i])>max) max=Integer.parseInt(seged[i]);
                }
                min=max;
                for(int i=0;i< seged.length;i++){
                    if(Integer.parseInt(seged[i])<min) min=Integer.parseInt(seged[i]);
                }
                osszeg += min*max;
            }
        System.out.println(osszeg);
    }
}

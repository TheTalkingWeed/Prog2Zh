import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hallgatok {
    private static List<Hallgato> diakok=new ArrayList<>();



    public void add(Hallgato temp){
        this.diakok.add(temp);
    }

    public static void findClassmates(String nk){
        Set<Integer> seged= new HashSet<>();
        Hallgato segedhallgato=new Hallgato(nk);
        for (Hallgato e:diakok) {
            if (e.getNk().equals(nk)) segedhallgato=e;
        }
        for(Hallgato e:diakok){
            if(e.getNk()!=nk){
                seged=e.getTargyak();
                seged.retainAll(segedhallgato.getTargyak());
                System.out.println(e.getNk()+": "+seged.size());
                seged.clear();
            }

        }
    }

}

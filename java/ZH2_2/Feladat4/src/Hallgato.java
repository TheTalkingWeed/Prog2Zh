import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hallgato {
    private String nk;
    private Set<Integer> targyak=new HashSet<>();

    public Hallgato(String nk) {
        this.nk = nk;

    }

    public Set<Integer> getTargyak() {
        return targyak;
    }

    public String getNk() {
        return nk;
    }

    public void addSubjects(List<Integer> list){
        targyak.addAll(list);
    }


}

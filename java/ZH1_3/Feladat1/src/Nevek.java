

import java.util.ArrayList;
import java.util.List;

public class Nevek {

    List<String> seged= new ArrayList<String>();




    public void append(String s){
        this.seged.add(s);
    }

    public int size(){
        return this.seged.size();
    }

    public boolean isEmpty(){
        if (this.seged.size()==0){
            return true;
        }
        return false;
    }

    public int countHasLetterJ(){
        int jszam=0;

        for (String temp: this.seged) {
                if (temp.contains("j")|| temp.contains("J"))
                    jszam++;
        }
        return jszam;
    }

    @Override
    public String toString() {
        return "< " + seged + " <";
    }

   public void appendAll(List<String> temp){
       for (String str: temp ) {
          seged.add(str);
       }
    }

}

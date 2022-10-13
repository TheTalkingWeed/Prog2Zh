import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Nevek nevek1= new Nevek();

        

        System.out.println(nevek1); 			//  < [] <
        System.out.println(nevek1.size()); 		//  0
        System.out.println(nevek1.isEmpty()); 		//  true
        nevek1.append("Péter");
        nevek1.append("József");
        nevek1.append("István");
        System.out.println(nevek1); 			//  < [Péter, József, Ajtony] <
        System.out.println(nevek1.size()); 		//  3
        System.out.println(nevek1.isEmpty()); 		//  false
        int count = nevek1.countHasLetterJ();
        System.out.println(count);			//  2
        System.out.println(nevek1);			//  < [Péter, József, Ajtony] <
        System.out.println(nevek1.size()); 		//  3
        nevek1.appendAll(List.of("Károly", "Ferenc"));	//  megjegyzés: List.of() itt egy 2 elemű
        //  listát készít
        System.out.println(nevek1);			//  < [Péter, József, Ajtony, Károly, Ferenc] <
    }
}

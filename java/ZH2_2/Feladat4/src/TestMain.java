import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        test_addSubjects();
        System.out.println("oksaa");
    }

    public static void test_addSubjects(){
        Hallgato hallgato1 = new Hallgato("RNK0I2");
        hallgato1.addSubjects(List.of(1, 3, 5, 7, 9, 12));
        Hallgato hallgato2 = new Hallgato("K9R3MN");
        hallgato2.addSubjects(List.of(2, 8, 11, 10, 5, 6));
        Hallgato hallgato3 = new Hallgato("IJKRST");
        hallgato3.addSubjects(List.of(3, 5, 4, 7, 9, 9)); //két ugyan olyan érték van (9) a hossz 5 lesz

        assert hallgato1.getTargyak().size()==6;
        assert hallgato3.getTargyak().size()==5;

        assert  hallgato1.getTargyak().equals(List.of(1, 3, 5, 7, 9, 12));
        assert  hallgato2.getTargyak().equals(List.of(2, 8, 11, 10, 5, 6));
    }

    public static void test_add(){


    }

    public static void test_FindClassmates(){

    }
}

public class UnitTest {
    public static void main(String[] args) {
        test_negyzet_kerulet();
        test_negyzet_terulet();
        System.out.println("ok");
    }

    private static void test_negyzet_kerulet(){
        assert Negyzet.kerulet(5)==20;
        assert Negyzet.kerulet(3)==12;
        assert Negyzet.kerulet(6)==24;
    }

    private static void test_negyzet_terulet(){
        assert Negyzet.terulet(5)==25;
        assert Negyzet.terulet(3)==9;
        assert Negyzet.terulet(6)==36;

    }
}

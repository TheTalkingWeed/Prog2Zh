public class UnitTest {
    public static void main(String[] args) {
        test_hamming();
        System.out.println("ok");
    }

    private static void test_hamming(){
        assert Hamming.distance("asd","dsa")==2;
        assert Hamming.distance("hagyma","kenyér")==5;
        assert Hamming.distance("varos","falu")==-1;
        assert Hamming.distance("alma","szog")==4;
    }
}


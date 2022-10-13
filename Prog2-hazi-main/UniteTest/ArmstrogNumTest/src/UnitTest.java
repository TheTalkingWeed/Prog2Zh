public class UnitTest {
    public static void main(String[] args) {
        test_isArmstrong();
        System.out.println("ok");
    }
    private static void test_isArmstrong(){
        assert Armstrong.isArmstrong("371")==true;
        assert Armstrong.isArmstrong("256")==false;
        assert Armstrong.isArmstrong("153")==true;
    }
    
}

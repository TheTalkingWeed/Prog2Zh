public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Hiba! Pontosan egy paraméter kell!");
        }else if (args[0].length() != 3 ){
            System.out.println("Hiba! Egy háromjegyu számot kell megadni");
        }else {
            boolean result2 = MyMath.isArmstrong(371);
            boolean result1 = MyMath.isArmstrong(Integer.parseInt(args[0]));

            System.out.println(result1);
            System.out.println(result2);
        }
    }
}
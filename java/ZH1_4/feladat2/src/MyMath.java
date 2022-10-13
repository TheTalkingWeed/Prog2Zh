public class MyMath {
    private MyMath() {
    }

    public static boolean isArmstrong(int number){
        int result = 0;
        String num = Integer.toString(number);

        for (int i = 0; i < num.length(); i++) {
            result += Math.pow(Integer.parseInt(Character.toString(num.charAt(i))),3);
        }

        return result == number;
    }
}

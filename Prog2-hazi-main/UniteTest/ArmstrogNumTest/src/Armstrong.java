public class Armstrong {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Egy paracssori argumentumot adjon meg");
            System.exit(1);
        } else if (args.length==1 && args[0].length()!=3){
            System.out.println("Harom elemu szamot adjon meg parancssori argumentumkkent");
            System.exit(1);
        }

        if (isArmstrong(args[0])){
            System.out.println("Ez Armstrong-szám.");
            System.exit(1);
        }
        System.out.println("Ez NEM Armstrong-szám.");
    }



    public static boolean isArmstrong(String n){
        int sum=0;
        for (int i = 0; i <n.length() ; i++) {
            sum+= harmadikon(Integer.parseInt(Character.toString(n.charAt(i))));
        }

        if (Integer.parseInt(n)==sum) return true;

        return false;
    }
    public static int harmadikon(int n){
        return n*n*n;
    }
}

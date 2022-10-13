public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Hiba! Nem megfelelő számú argumentumot adott meg!");
            System.exit(1);
        }else {
            int sum = 0;
            int temp = 0;
            System.out.println(args[0]);
            for (int i = args[0].length()-1; i >= 0 ; i--) {
                sum += Integer.parseInt(Character.toString(args[0].charAt(i))) * Math.pow(2,temp);
                temp++;
            }

            System.out.println(sum);
        }
    }
}

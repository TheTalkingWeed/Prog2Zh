public class Main {
    public static void main(String[] args) {
        if (args.length<3){
            System.out.println("Hibás paraméterezés!");
            System.exit(1);
        }
        int felso=Integer.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int also=Integer.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int index=1;
        int i=also;
        while (i<felso){
            System.out.printf("%d. elem :%d ,",index,i);

            index++;
            i+=Integer.parseInt(args[2]);
        }

    }
}

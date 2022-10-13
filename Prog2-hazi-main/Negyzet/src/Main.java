import java.util.Scanner;

public class Main {
    public static class Negyzet {
        public int oldal;

        public Negyzet(int oldal) {
            this.oldal = oldal;
        }

        public int kerulet(){
            return this.oldal*4;
        }

        public int terulet(){
            return this.oldal*this.oldal;
        }



    }



    public static void main(String[] args) {
        System.out.println("Adja meg a negyzet oldalat:");
        Scanner sc = new Scanner(System.in);
        Negyzet negyzet = new Negyzet(sc.nextInt());
        
        int k = negyzet.kerulet();    // 12
        int t = negyzet.terulet();    // 9
        System.out.println("A negyzet kerulete: " + k);
        System.out.println("A negyzet terulete: " + t);

    }
}

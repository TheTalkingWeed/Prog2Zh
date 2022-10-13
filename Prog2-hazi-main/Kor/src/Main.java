import java.util.Scanner;

public class Main {
    public static class Circle{

            public double sugar;

            public Circle(double sugar) {
                this.sugar = sugar;
            }

            public double kerulet(){

                return 2* Math.PI*sugar;
            }

            public double terulet(){

                return Math.PI*sugar*sugar;
            }

        public static void main(String[] args) {
            System.out.println("Adja meg a kor sugarat: ");
            Scanner sc = new Scanner(System.in);
            Circle kor = new Circle(sc.nextDouble());

            double k = kor.kerulet();    // 12
            double t = kor.terulet();    // 9
            System.out.println("A kor kerulete: " + k);
            System.out.println("A kor terulete: " + t);

        }


    }
}

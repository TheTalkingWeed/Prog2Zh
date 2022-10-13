import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Szoveg: ");
        System.out.println(StringUtils.isPangram(sc.nextLine()));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Szöveg: ");
        input = sc.nextLine();
        System.out.print("<E>\n");
        System.out.println("Maganhagzok: "+StringUtils.stat(input)[0]);
        System.out.println("Massalhangzok: "+StringUtils.stat(input)[1]);
        System.out.println("Szamjegyek: "+StringUtils.stat(input)[2]);
    }
}
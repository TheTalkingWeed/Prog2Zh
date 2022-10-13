import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input;
        System.out.println("Adjon meg egy szot: ");
        input=sc.nextLine();
        StringUtils.atcsere(input);
    }
}

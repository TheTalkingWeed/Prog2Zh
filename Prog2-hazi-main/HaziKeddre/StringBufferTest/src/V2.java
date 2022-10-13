
//String builder megoldas

import java.util.Scanner;

public class V2 {
    public static void main(String[] args) {
        final int n=FileUtils.readLines("config.txt");
        System.out.println("SB valtozat");
        System.out.println("A program elindult... ");


        System.out.println(StringBuilderMegoldas(n));

    }

    public static String StringBuilderMegoldas(int n){
        StringBuilder output=new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(Integer.toString(i+1));
        }

        return output.toString();
    }
}

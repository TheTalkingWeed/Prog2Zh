
//naiv megoldas

import java.util.Scanner;

public class V1 {
    public static void main(String[] args) {
        final int n=FileUtils.readLines("config.txt");
        System.out.println("Naiv valtozat");
        System.out.println("A program elindult...  ");
        
        System.out.println(naivMegoldas(n));
    }

    public static String naivMegoldas(int n){
        String output="";
        for (int i = 0; i <n ; i++) {
            output += Integer.toString(i+1);
        }
        return output;
    }
}

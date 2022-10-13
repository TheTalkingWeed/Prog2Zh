import java.sql.SQLOutput;

public class StringUtils {
    public static void atcsere(String s){
        if (s.contains("@")){
            int i=s.indexOf("@");
            StringBuilder sb=new StringBuilder();

            sb.append(s.substring(i,s.length())).append(s.substring(0,i));
            System.out.printf("Uj string: %s \n",sb);
            System.out.printf("Az uj szo hossza: %d \n",s.length());

        }else if (!(s.contains("@"))){
            System.out.printf("Uj string: %s \n",s);
            System.out.printf("Az uj szo hossza: %d \n",0);
        }



    }
}

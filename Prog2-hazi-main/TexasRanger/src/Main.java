import java.util.ArrayList;
import java.util.List;

class PyUtils {

    public static List<Integer> range(int a, int b){
        List<Integer> result=new ArrayList<Integer>();

        for (int i=a;i<b;i++) result.add(i);


        return result;
    }

    public static List<Integer> range(int a){
        List<Integer> result=new ArrayList<Integer>();

        for (int i=0;i<a;i++) result.add(i);

        return result;
    }

    public static List<Integer> range(int a,int b,int c){
        List<Integer> result=new ArrayList<Integer>();
        int i=a;
        while (i<b){
            result.add(i);
            i+=c;
        }

        return result;
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println(PyUtils.range(0, 5));

        System.out.println(PyUtils.range(3, 7));
        System.out.println(PyUtils.range(3, 4));
        System.out.println(PyUtils.range(3, 3));
        System.out.println("-----------------");
        System.out.println(PyUtils.range(10));

        System.out.println(PyUtils.range(1));
        System.out.println(PyUtils.range(0));
        System.out.println(PyUtils.range(-4));
        System.out.println("-----------------");
        System.out.println(PyUtils.range(4, 20, 2));
        System.out.println(PyUtils.range(4, 10, 1));
        System.out.println(PyUtils.range(10, 4, 1));

    }
}

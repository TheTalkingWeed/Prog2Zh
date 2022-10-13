public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Adjon meg parancssori argumentumot");
        } else {
            System.out.println("köztes eredmény: "+removeDifferent(args[0],args[1]));
            System.out.println("véges eredmény: "+removeDifferent(removeDifferent(args[0],args[1]),args[2]));
        }
    }

    private static String removeDifferent(String firstString,String secondString){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            if (secondString.contains(Character.toString(firstString.charAt(i)))){
                output.append(firstString.charAt(i));
            }
        }


        return output.toString();
    }
}

class Hamming{

    private String string1;
    private String string2;

    /*public Hamming(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }*/

    public static int distance(String s1, String s2)
    {
        int count=0;
        if(s1.length()!=s2.length())
        {
            return -1;

        }
        else
        {

            for(int i=0;i<s1.length();i++)
            {

                if(s1.charAt(i)!=s2.charAt(i))
                    count++;
            }
            return count;


        }
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    @Override
    public String toString() {
        return String.format("A ket szoved Hamming tavolsaga: %d",distance(getString1(),getString2()));
    }
}
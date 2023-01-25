public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0,7);
        String sub2 = string1.substring(6,14);

        int j =string1.length() + string2.length();
        //System.out.println(j);

        char[] charArray = (sub1 + string2 + sub2).toUpperCase().toCharArray();

        System.out.println(charArray);





    }
}

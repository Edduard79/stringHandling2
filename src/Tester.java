public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        String string1 = "United432 Kingdom43";
        String string2 = "Germany34";

        int j = string1.indexOf(" ");


        String sub1 = string1.substring(0,j);
        String sub2 = string1.substring(j + 1);

        System.out.println((sub1 +" "+ string2 +" "+ sub2).toUpperCase());


    }
}

package ex_04_Operators;

public class Lab037_Interview_Concat {
    public static void main(String[] args) {
        String first_name = "Vihaan";
        String last_name = "Chougule";

        int a = 12;
        int b = 34;

        System.out.println(first_name+last_name+a+b);//VihaanChougule1234
        System.out.println(a+b+first_name+last_name);

        System.out.println(first_name+last_name+(a+b)); // BODMAS - Bracket of Div, mul, add, sub
    }
}

package ex_05_TypeCasting;

public class Lab054_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 8197080966l;
        //short s = phone_no; // Narrowing - implicit
        short s1 = (short) phone_no;// Narrowing - Explicit
        System.out.println(s1); //-30842
    }
}

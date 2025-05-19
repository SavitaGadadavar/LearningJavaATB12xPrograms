package ex_05_TypeCasting;

public class Lab052_TypeCasting {
    public static void main(String[] args) {
        byte b = 20;
        int a = b;// Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int) b;// Widening Explicit Casting (int) - optional
        System.out.println(a1);

    }
}

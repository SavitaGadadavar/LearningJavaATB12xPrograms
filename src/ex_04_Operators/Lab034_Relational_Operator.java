package ex_04_Operators;

public class Lab034_Relational_Operator {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.
        int a = 10;
        int b = 20;
        boolean c = a > b; //10>20
        System.out.println(c);

        int savita_age = 31;
        int praveen_age = 36;
        boolean result = savita_age<=praveen_age;
        System.out.println(result);
        // savita_age > praveen_age or praveen_age = savita_age

    }
}

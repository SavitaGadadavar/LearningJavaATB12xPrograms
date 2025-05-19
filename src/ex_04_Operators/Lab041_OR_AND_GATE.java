package ex_04_Operators;

public class Lab041_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR
        System.out.println(true || false); // true
        System.out.println(false || false); //false
        System.out.println(false || true); //true
        System.out.println(true || true); //true

        //  && - AND only true && true returns true
        System.out.println(true && false); //false
        System.out.println(false && false);//false
        System.out.println(false && true);// false
        System.out.println(true && true); //true
    }
}

package ex_04_Operators;

public class Lab042_Interview {
    public static void main(String[] args) {
        int savita_salary = 12;
        boolean b = !(savita_salary > 10 || savita_salary < 5);
        System.out.println(b);
        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}

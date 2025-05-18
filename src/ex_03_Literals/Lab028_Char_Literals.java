package ex_03_Literals;

public class Lab028_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A';
        //        char c = "A"; // "" == String = Bunch of Char
char c2 = 'B';
char c3 = '@';
char c4 = '9';
char c5 = '1';
char c6 = ' '; // blank space
        char c7 = ')';
        char c8 = '_';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        System.out.println("savitagadadavar");
        System.out.println("savita"+new_line+"gadadavar");
        System.out.println("savita\ngadadavar");
        System.out.println("savita"+tab_line+"gadadavar");
        System.out.println("savita"+back_space+"gadadavar");
        System.out.println("savita"+carriage_return+"gadadavar");

        System.out.println("Hi, this is the first line"+new_line+"this is the second line \n this is the third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
    }
}

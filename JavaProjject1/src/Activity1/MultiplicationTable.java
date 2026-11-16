package Activity1;

public class MultiplicationTable {

    public static void main(String[] args) {

        // loop for tables 11 to 20
        for (int i = 11; i <= 20; i++) {
            System.out.println("* Table of " + i + " *");

            // loop for multipliers 1 to 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            System.out.println("-------------");
        }
    }
}

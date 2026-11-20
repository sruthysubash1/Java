package module10;

public class Calculator {

    // 2 Add methods

    //1.Adding 2 numbers
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    /*2.Adding 4 numbers
       Method overloading
     */
    public int add(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    //Subtract method
    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

   //Divide method
   public int divide(int number1, int number2) {
       int result = 0;
       try {
           result = number1 / number2;
       } catch (ArithmeticException e) {
           System.out.println("Cannot divide by Zero " + e.getMessage());
       }
       return result;
   }

   // Exception handling class
    public static class InvalidMultiplicationInputException extends Exception {
        public InvalidMultiplicationInputException(String message) {
            super(message);
        }
    }
    public int multiply(int number1, int number2) {
        int result = 0;
        try {
            if (number1 == 0 || number2 == 0) {
                throw new InvalidMultiplicationInputException("Numbers should not be Zero");
            }
            result = number1 * number2;
        } catch (InvalidMultiplicationInputException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}

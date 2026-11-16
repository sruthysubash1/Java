package Activity1;

public class Calculator {


    public static int add(int x, int y)
    {
        int sum = x + y;
        return sum;
    }

    public static int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }

    public static int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }

    public static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x / y;
        }
        return divValue;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] num = {1, 2, 3, 4};

        System.out.println("Addition : " + add(x, y));
        System.out.println("Subtraction : " + subtract(x, y));
        System.out.println("Multiply : " + multiply(num));
        System.out.println("Divide : " + divide(x, y));
    }

}


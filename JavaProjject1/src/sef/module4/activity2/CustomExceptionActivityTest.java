package sef.module4.activity2;

public class CustomExceptionActivityTest {

    // 1 - Type main method and call validateUser() from it.
    // Call this method with different names to test it.
    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();

        try {
            obj.validateUser("Mike");  // Valid user
            obj.validateUser("Alex");  // Invalid user - throws CustomExceptionActivity
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        // Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (validUsers[i].equals(name)) {
                flag = 1;
                break;
            }
        }

        // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
        // You may also have to declare this exception in the method signature using throws.
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }
        // 4 - Else if flag is one, print a message "Welcome to Payroll program".
        else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }
}


package sef.module4.activity2;

// Needs to be completed

// The following program, when run, results in an exception.

// 1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed.

    public class TryCatchFinallyActivity {

        public static void main(String[] args) {

            TryCatchFinallyActivity obj = new TryCatchFinallyActivity();

            obj.catchMeIfYouCan();

        }

        void catchMeIfYouCan() {

            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            // TODO: Use try
            try{

            for (int i = 0; i <= 10; i++) {

                System.out.println(arr[i]);
            }
            }
            // TODO: Create catch for try and use IndexOutOfBoundsException
            catch (IndexOutOfBoundsException e) {
                // TODO: In catch create custom System.out.println message
                System.out.println("Invalid index number");
            }
            // TODO: Use finally block so that this message gets printed out whether or not an error has occurred
         finally{
            System.out.println("This should get printed even if there is an exception");

        }

    }

}

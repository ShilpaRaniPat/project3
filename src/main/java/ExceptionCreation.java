import java.util.Scanner;


public class ExceptionCreation {

    // Driver Program
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        try {
            // Throw an object of user defined exception
            System.out.println(w);
            throw new MyException("CreatingException");


        } catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("finally is always located after catch block");
        }

    }
}

        class MyException extends Exception {
            public MyException(String s) {
                // Call constructor of parent Exception
                super(s);
            }
        }







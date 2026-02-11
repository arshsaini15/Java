package ExceptionHandling;

// Custom exception class
class AgeNotValidException extends Exception {

    public AgeNotValidException(String message) {
        super(message);
    }
}

public class CustomHandling {

    // Method to check age
    static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkAge(age);
        }
        catch (AgeNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

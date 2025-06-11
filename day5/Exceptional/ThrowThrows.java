package Exceptional;

// Custom exception classes

public class ThrowThrows {

    static void ValidAge() throws AgeValid {
        throw new AgeValid("Age is valid exception");
    }

    static void InvalidAge() throws AgeInvalid {
        throw new AgeInvalid("Age is invalid exception");
    }

    public static void main(String[] arg) {
        var age = 10;
        try {
            if (age < 18) {
                InvalidAge();
            } else {
                System.out.println("Allowed");
            }
        } catch (AgeInvalid e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

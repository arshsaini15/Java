package ExceptionHandling;

public class eh1 {
    public static String f() {
        try {
            int x = 0;

            try {
                int y = x/0;
            }
            catch(NullPointerException e) {
                System.out.println("Auto");
            }
            finally {
                // System.out.println("Taxi"); // calls outer catch block then outer finally
                return "Taxi"; // hold, outer finally called.
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Ola");
        }
        finally {
            System.out.println("Uber");
            return "Rapido";
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(f());
    }
}

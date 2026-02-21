package DesignPatterns;

/*

Lazy Loading -> Creates an Objects when user demands.
Eager Loading -> Creates Object at the time of class loading. (use static)

 */

// Eager Loading
class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {

        /*

        Without private constructor user can create
        many objects of different addresses, here we
        are forcing user to create instance using
        getInstance() method.

        Singleton s= new Singleton();
        Singleton t= new Singleton();
        System.out.println(s+","+t);

         */


        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 +","+ s2);
        System.out.println(s1 == s2);
    }
}

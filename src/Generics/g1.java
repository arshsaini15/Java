package Generics;

class A <T, U> {
    T x;
    U s;

    void f() {
        System.out.println(x + " " +  s);
    }
}

public class g1 {
    public static void main(String[] args) {
        A <Integer, String> a = new A<>();
        a.x = 1;
        a.s = "ABC";
        a.f();
    }
}
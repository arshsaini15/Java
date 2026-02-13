// Thread class vs Runnable interface

package MultiThreading;

import java.util.*;
import java.lang.*;
import java.io.*;

class M implements Runnable {
    String k;

    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(k);
        }
    }

    M (String p) {
        k = p;
    }
}

class X extends Thread {
    String k;

    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(k);
        }
    }

    X (String p) {
        k = p;
    }
}

class p1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Thread t1 = new X("t1 Running");
        Thread t2 = new X("t2 Running");

        t1.start();
        t2.start();

//        Runnable x1 = new X("x1 Running");
//        Runnable x2 = new X("x2 Running");

        // x1.run();
        // x2.run();
    }
}

package kevincruse;

public class Main {

    public static void main(String[] args) {
        //recursion
        //print1(5);
        //print2(15);
        boolean flag = true;
        flag = isPrime(23, 2);
        if (flag) {
            System.out.println("is a prime number\n");
        } else {
            System.out.println("is not a prime number\n");
        }
        sum (4);
        sum (4.0);
        sum (2, 3);
        sum (5.0, 10.0);
    }

    public static void print1(int p) {
        //counting up
        if (p == 0) {
            return;
        }
        print1(p - 1);
        System.out.println(p);
        return;
    }

    public static void print2(int p) {
        //counting down
        if (p == 0) {
            return;
        }
        System.out.println(p);
        print2(p - 1);
        return;
    }

    public static boolean isPrime(int c, int i) {
        if (i == c) {
            return true;
        }
        if (c % i == 0) {
            return false;
        }
        return isPrime(c, i + 1);
    }

    public static void sum (int a) {
    }

    public static void sum (double a) {
    }

    public static void sum (int a, int b) {
    }

    public static void sum (double a, double b) {
    }
}
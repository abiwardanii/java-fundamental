package src;

public class Math {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //augmentend assigment
        int c = 30;
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        //unary operator
        int d = 40;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
    }
}

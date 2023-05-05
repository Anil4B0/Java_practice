public class methodsoverloading {

    int a;
    int b;

    void sum() {

        a = 10;
        b = 20;
        System.out.println(a + b);
    }

    void sum(int x, int y) {

        int a = x;
        int b = y;
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {

        System.out.println(a + b + c);
    }

    void sum(int a, double b) {

        System.out.println(a + b);
    }

    public static void main(String[] args) {

        methodsoverloading add = new methodsoverloading();

        add.sum();
        add.sum(10, 20);
        add.sum(10, 20, 30);
        add.sum(10, 10.5);
    }

}

public class oops5 {

    int a;
    int b;

    public static void main(String[] args) {

        oops5 add = new oops5();
        add.sum(10, 20);
    }

    void sum(int x, int y) {

        a = x;
        b = y;
        System.out.println(a + b);
    }
}

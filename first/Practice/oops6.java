public class oops6 {

    int a;
    int b;

    public static void main(String[] args) {

        oops6 add = new oops6();
        add.a = 100;
        add.b = 10;
        System.out.println(add.sum());

    }

    int sum() {
        return (a + b);
    }

}

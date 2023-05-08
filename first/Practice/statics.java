public class statics {

    int a;
    static int b;

    static void point1() {

        b = 100;
        statics sta = new statics();
        sta.a = 700;

    }

    void point2() {

        b = 600;
        a = 900;

        System.out.println(a);
    }

    public static void main(String[] args) {

        statics sta = new statics();
        sta.point2();

    }

}

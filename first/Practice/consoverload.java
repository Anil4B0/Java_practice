public class consoverload {

    int a;
    double b;
    int c;

    consoverload() {

        a = 100;
        b = 110;
        c = 120;

    }

    consoverload(int x, int y) {

        a = x;
        b = y;
    }

    consoverload(int x, double y) {

        a = x;
        b = y;
    }

    consoverload(int x, double y, int z) {

        a = x;
        b = y;
        c = z;
    }

    void dis() {

        System.out.println(a + b);

        System.out.println(a + c);
        System.out.println(b + c);

    }

    public static void main(String[] args) {

        /*
         * consoverload co = new consoverload();
         * co.dis();
         * consoverload co1 = new consoverload(10, 20.5);
         * co1.dis();
         */
        consoverload co2 = new consoverload(10, 20.5, 60);
        co2.dis();
        /*
         * consoverload co3 = new consoverload(10, 90);
         * co3.dis();
         */

    }

}

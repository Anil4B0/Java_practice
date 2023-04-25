public class assignmenst {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int d = 50;

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

        if (a % 2 == 0) {
            System.out.println("even number");
        } else {

            System.out.println("odd number");
        }

        if ((a > b) && (a > d)) {
            System.out.println("a is bigger");
        } else if ((b > a) && (b > c)) {

            System.out.println("b is bigger");
        }

        System.out.println("c is bigger");

    }

}

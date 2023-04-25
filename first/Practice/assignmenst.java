public class assignmenst {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

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

    }

}

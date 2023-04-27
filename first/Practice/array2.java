public class array2 {
    public static void main(String[] args) {

        int val[] = { 5, 10, 20, 30 };
        Object a[] = { "Anil", 10, 12.3, 'K' };

        int sum = 0;

        for (int i : val) {
            sum += i;
        }
        System.out.println("addition of all = " + sum);

        for (Object i : a) {

            System.out.println("values = " + i);
        }

    }
}

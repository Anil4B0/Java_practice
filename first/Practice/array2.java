public class array2 {
    public static void main(String[] args) {

        int val[] = { 5, 10, 20, 30 };

        int sum = 0;

        for (int i : val) {
            sum += i;
        }

        System.out.println("addition of all = " + sum);

    }
}

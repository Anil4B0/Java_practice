public class loops {

    public static void main(String[] args) {

        int number = 2;

        while (number <= 10) {
            System.out.println("number is = " + number);
            number += 2;

        }
        int num = 20;
        do {
            System.out.println("number is = " + number);
            num += 2;
        } while (num <= 10);

        for (int digits = 1; digits <= 10; digits++) {

            System.out.println("numbers in for loops are = " + digits);
        }

    }

}

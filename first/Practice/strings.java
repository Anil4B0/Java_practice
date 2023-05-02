public class strings {

    public static void main(String[] args) {

        String a = "Anil";
        String b = "Krishna";
        String c = "anil";

        System.out.println(a.length());
        System.out.println(a + " " + b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.contains("K"));
        System.out.println(b.replace('q', 'c'));
        System.out.println(a.substring(0, 3));
    }

}

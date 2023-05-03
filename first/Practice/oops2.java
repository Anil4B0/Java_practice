public class oops2 {

    String studentname;
    int stno;
    String section;

    oops2(String stname, int sno, String sec) {

        studentname = stname;
        stno = sno;
        section = sec;

    }

    void dispaly() {
        System.out.println("Student name    is " + studentname);
        System.out.println("Student number  is " + stno);
        System.out.println("Student section is " + section);
    }

    public static void main(String[] args) {

        // initializing values using constructor

        oops2 emp1 = new oops2("Anil", 10, "AAA");
        emp1.dispaly();

    }

}

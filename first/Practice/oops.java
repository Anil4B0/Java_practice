public class oops {

    String studentname;
    int stno;
    String section;

    void dispaly() {
        System.out.println("Student name    is " + studentname);
        System.out.println("Student number  is " + stno);
        System.out.println("Student section is " + section);
    }

    public static void main(String[] args) {

        // initializing values using direct objects

        oops student1 = new oops();
        student1.studentname = "Anil";
        student1.stno = 10;
        student1.section = "AA";
        student1.dispaly();

        oops student2 = new oops();
        student2.studentname = "Krishnama";
        student2.stno = 11;
        student2.section = "AA";
        System.out.println(" ");
        student2.dispaly();

    }

}

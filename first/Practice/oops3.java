public class oops3 {

    String studentname;
    int stno;
    String section;

    void dispaly() {
        System.out.println("Student name    is " + studentname);
        System.out.println("Student number  is " + stno);
        System.out.println("Student section is " + section);
    }

    void setdata(String stname, int sno, String sec) {

        studentname = stname;
        stno = sno;
        section = sec;
    }

    public static void main(String[] args) {

        // initializing values using methods
        oops3 emp1 = new oops3();
        emp1.setdata("Anil", 10, "aaa");
        emp1.dispaly();
    }

}

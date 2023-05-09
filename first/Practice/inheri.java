class inheri {

    int a;
    int b;

    void dis() {

        System.out.println(a + b);
    }

}

class inheri2 extends inheri {

    int x;
    int y;

    void main() {
        System.out.println(x + y);

    }

}

class inheri4 extends inheri2 {

    void main2() {

        System.out.println(a + b);

    }

}

class inheri3 {

    public static void main(String[] args) {
        inheri2 obj = new inheri2();
        obj.a = 200;
        obj.b = 300;
        obj.dis();

    }

}

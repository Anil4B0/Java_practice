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

class Inheri3{
    public static void main(String[] args){

        inheri num = new inheri();
        num.a = 100;
        num.b = 200;
        num.dis();
    }


}


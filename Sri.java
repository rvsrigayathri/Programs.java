class Raja{
    int a=99;
    void m1(){
        System.out.println("Wonderful");
    }
}
class Giri extends Raja{
    int b=100;
    void m2(){
        System.out.println("Day");
    }
}
class Sri extends Giri{
    int c=101;
    void m3(){
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Sri m=new Sri();
        m.m1();
        m.m2();
        m.m3();
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
    }
}
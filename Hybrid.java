package myprograms;

class Raja{
	int a=100;
	void m1() {
		System.out.println("Good");
	}
}
class Giri extends Raja{
	int b=200;
	void m2() {
		System.out.println("Great");
	}
}
class Sri extends Raja{
	int c=300;
	void m3() {
		System.out.println("Excellent");
	}
}
class Hybrid extends Giri{
	int d=400;
	void m4() {
		System.out.println("Marvalous");
	}
	public static void main(String args[]) {
		Hybrid h=new Hybrid();
		h.m1();
		System.out.println(h.a);
		h.m2();
		System.out.println(h.b);
		h.m4();
		System.out.println(h.d);
	}
}

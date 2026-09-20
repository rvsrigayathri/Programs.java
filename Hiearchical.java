package myprograms;
class Raja {
	int a=100;
	void m1() {
		System.out.println("Good");
	}

}
class Hiearchical1 extends Raja{
	int b=199;
	void m2() {
		System.out.println("Bad");
	}
}
class Hiearchical extends Raja{
	int c=198;
	void m3() {
		System.out.println("Ugly");
	}
	public static void main(String args[]) {
		Hiearchical1 h1=new Hiearchical1();
		Hiearchical h2=new Hiearchical();
		h1.m1();
		System.out.println(h1.a);
		h1.m2();
		h2.m1();
		System.out.println(h2.a);
		h2.m3();
		
	}
}

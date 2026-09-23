package myprograms;
abstract class Raja{
	void m1() {
		System.out.println("Cool");
	}
	void m2() {
		System.out.println("Dude");
	}
}
class AbstractionType3 extends Raja{
	public static void main(String args[]) {
		AbstractionType3 at=new AbstractionType3();
		at.m1();
		at.m2();
	}
}

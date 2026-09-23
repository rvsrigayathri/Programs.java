package myprograms;

abstract class Raja{
	abstract void m1();
	abstract void m2();
}
class AbstractionType2 extends Raja{
	void m1() {
		System.out.println("Happy Morning");
	}
	void m2() {
		System.out.println("Have a Wonderful day");
	}
	public static void main(String args[]) {
		AbstractionType2 at=new AbstractionType2();
		at.m1();
		at.m2();
	}
}

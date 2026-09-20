package myprograms;

class Raja{
	int a=100;
	void m1() {
		System.out.println("Excellent");
	}
}
class Method_Over_Ridding extends Raja{
	int a=100;
	void m1() {
		System.out.println("Excellent");
	}
	public static void main(String args[]) {
		Method_Over_Ridding mor=new Method_Over_Ridding();
		mor.m1();
		System.out.println(mor.a);
		System.out.println("Marvalous");
	}
}

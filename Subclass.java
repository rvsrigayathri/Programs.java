class SingleInheritance {
	int a=100;
	void m1() {
		System.out.println("Good");
	}

}
class Subclass extends SingleInheritance{
	int b=99;
	void m2() {
		System.out.println("Bad");
	}
	public static void main(String args[]) {
		Subclass s=new Subclass();
		s.m1();
		System.out.println(s.a);
		s.m2();
		System.out.println(s.b);
	}
}
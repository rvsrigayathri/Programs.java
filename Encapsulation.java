package myprograms;

class Raja{
	private int gold;
	public void set(int g) {
		gold=g;
	}
	public int get() {
		return gold;
	}
	
}
class Encapsulation {
	public static void main(String args[]) {
	Raja r=new Raja();
	r.set(100);
	int k=r.get();
	System.out.println(k);
	}
}

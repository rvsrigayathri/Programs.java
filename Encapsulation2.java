package myprograms;


class Raja{
	private int gold;
	public void set(int gold) {
		this.gold=gold;
	}
	public int get() {
		return gold;
	}
}
class Encapsulation2 {
	public static void main(String args[]) {
		Raja r=new Raja();
		r.set(1000);
		int k=r.get();
		System.out.println(k);
	}
	

}

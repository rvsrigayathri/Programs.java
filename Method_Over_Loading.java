package myprograms;
class Method_Over_Loading {
	int area(int a,int b) {
		return a*b;
	}
	float area(float a,float b) {
		return a+b;
	}
	public static void main(String args[]) {
		Method_Over_Loading m=new Method_Over_Loading();
		int c=m.area(10,10);
		System.out.println(c);
		float d=m.area(95.5f,5.05f);
		System.out.println(d);
	}
}

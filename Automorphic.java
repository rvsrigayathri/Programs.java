package myprograms;
import java.util.Scanner; 
public class Automorphic {

	public static void Square(int num,int square) {
		int count1=0;
		int count2=0;
		while(num>0) {
			int rem1=num%10;
			count1=count1*10+rem1;
			num=num/10;
			int rem2=square%10;
			count2=count2*10+rem2;
			square =square/10;
		}
		if(count1==count2) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not Automorphic");
		}
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int square =num*num;
		Square(num,square);
	}

}

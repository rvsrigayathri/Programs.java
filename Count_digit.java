package myprograms;
import java.util.Scanner; 
public class Count_digit {
	
	public static void Add(int num,int count) {
		while (num>0) {
			int rem=num%10;
			count=count+1;
			num=num/10;
		}
		System.out.println(count);
	}

	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int count=0;
		Add(num,count);
	}

}

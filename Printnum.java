package myprograms;
import java.util.Scanner;
class Printnum {
	static void Sum(int num,int sum) {
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.print(sum);
	}

	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int sum=0;
		Sum(num,sum);
	}

}

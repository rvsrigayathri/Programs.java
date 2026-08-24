package myprograms;
import java.util.Scanner;
public class PerfectNumber{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n=a.nextInt();
		Number(n);
	}
	public static void Number(int n){
	    int temp=n;
	    int sum=0;
	    for(int i=1;i<n;i++){
	        if(temp%i==0){
	            sum=sum+i;
	        }
	    }
	    if(sum==n){
	        System.out.println("Perfect Number");
	    }
	    else{
	        System.out.println("Not Perfect Number");
	    }
	}
}

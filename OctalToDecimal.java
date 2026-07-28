package myprograms;
import java.util.Scanner;
class OctalToDecimal {
    
    public static void Octal(int num,int count){
        int pow=1;
        while(num>0){
            int rem=num%10;
            count=count+rem*pow;
            pow=pow*8;
            num=num/10;
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        int count=0;
        Octal(num,count);
    }
}
package myprograms;
import java.util.Scanner;
class DecimalToOctal {
    
    public static void Octal(int num,int count){
        int pow=1;
        while(num>0){
            int rem=num%8;
            count=count+rem*pow;
            pow=pow*10;
            num=num/8;
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

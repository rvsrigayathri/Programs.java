package myprograms;
import java.util.Scanner;
public class BinaryToHexaDecimal {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int binary=a.nextInt();
        int res=decimal(binary);
        hexadecimal(res);
    }
    public static int decimal(int binary){
        int decimal=0;
        int pow=1;
        while(binary>0){
            int rem=binary%10;
            decimal=decimal+(rem*pow);
            pow=pow*2;
            binary=binary/10;
        }
        return decimal;
    }
    public static void hexadecimal(int res){
        String result="";
        while(res>0){
            int rem=res%16;
            if(rem<10){
                result=rem+result;
            }
            else{
                char ch=(char)('A'+(rem-10));
                result=ch+result;
            }
            res=res/16;
        }
        System.out.print(result);
    }
}
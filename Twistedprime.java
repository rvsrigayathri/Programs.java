package myprograms;
import java.util.Scanner;
public class Twistedprime {
    public static void TwistedPrime(int num) {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count1++;
            }
        }
        for (int i = 1; i <= reverse; i++) {
            if (reverse % i == 0) {
                count2++;
            }
        }
        if (count1 == 2 && count2 == 2) {
            System.out.println("Twisted Prime");
        } 
        else {
            System.out.println("Not a Twisted Prime");
        }
    }
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        TwistedPrime(num);
    }
}
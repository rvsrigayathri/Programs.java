package myprograms;

import java.util.Scanner;

public class BinaryToBinary {

    public static void AddBinary(long num1, long num2) {

        long result = 0;
        long place = 1;
        int carry = 0;

        while (num1 > 0 || num2 > 0 || carry > 0) {

            int bit1 = (int)(num1 % 10);
            int bit2 = (int)(num2 % 10);

            int sum = bit1 + bit2 + carry;

            result = result + (sum % 2) * place;
            carry = sum / 2;

            place = place * 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        AddBinary(num1, num2);
    }
}

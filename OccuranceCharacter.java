package myprograms;
import java.util.Scanner;

public class OccuranceCharacter {

    public static void countOccurrence(String str) {

        boolean visited[] = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {

            if (visited[i] == true) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(str.charAt(i) + "=" + count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        countOccurrence(str);

        sc.close();
    }
}

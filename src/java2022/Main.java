package java2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        System.out.print("Choose a height between 1-8: ");
        int num;
        num = val.nextInt();

        while (num < 1 || num > 8) {
            System.out.print("Choose a height between 1-8: ");
            num = val.nextInt();
        }

        if (num > 1 && num < 9); {
            for (int i = 0; i < num; i++) {
                for (int a = 0; a < num - i - 1; a++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }

                System.out.print("  ");

                for (int k = 0; k <= i; k++) {
                    System.out.print("#");
                }
                System.out.print("\n");

            }

        }
    }
}




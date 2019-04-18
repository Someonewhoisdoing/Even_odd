package a;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("Integer is even.");
        } else {
            System.out.println("Integer is odd.");
        }
    }
}


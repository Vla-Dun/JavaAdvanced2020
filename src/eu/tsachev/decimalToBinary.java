package eu.tsachev;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.valueOf(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

// TODO: check if number is 0

        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}


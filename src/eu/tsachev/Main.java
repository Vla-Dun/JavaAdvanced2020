package eu.tsachev;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
//        ArrayDeque<Integer> stack = new ArrayDeque();
//
//
//        stack.push(100);
//        stack.push(55);
//
//
//        //int topInt = stack.peek();
//        System.out.println(stack.peekLast());
//        System.out.println(stack.size());


        ArrayDeque<String> browser = new ArrayDeque<>();

        String current = "";

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!browser.isEmpty()) {
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if (!current.equals("")) {
                    browser.push(current);
                }
                current = line;
            }
            System.out.println(current);
            line = scanner.nextLine();
        }
    }
}

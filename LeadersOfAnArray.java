package leadersOfArray;

import java.util.Scanner;
import java.util.Stack;

public class LeadersOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter Elements of Array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        // LeadersOfAnArray leadersOfAnArray = new LeadersOfAnArray();
        leader(array, size);

    }

    public static void leader(int array[], int size) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(array[size - 1]);
        for (int i = size - 2; i >= 0; i--) {
            if (array[i] > stack.peek()) {
                stack.push(array[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        // System.out.print(array[size - 1]);
    }
}

import java.util.Scanner;

public class Problem7 {
    public static void reversePrint(int index, int[] numbers) {
        if (index < 0) {
            return;
        }
        System.out.print(numbers[index] + " ");
        reversePrint(index - 1, numbers);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        reversePrint(n - 1, numbers);
    }
}
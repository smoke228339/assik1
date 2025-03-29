import java.util.Scanner;

public class Problem2 {
    public static float avg_num(int arr[]){
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        float avg = avg_num(arr);
        System.out.println(avg);
    }
}

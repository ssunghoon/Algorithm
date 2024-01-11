import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Long[] arr = new Long[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLong();
        }

        Arrays.sort(arr);

        long min = 0;
        // 짝수일 때, 홀수일 때
        if (N % 2 == 0) {
            for (int i = 0; i < (N - 1) / 2; i++) {
                if (min < arr[i] + arr[((N - 1) - i)]) min = arr[i] + arr[((N - 1) - i)];
            }
        } else {
            min = arr[N-1];
            for (int i = 0; i < (N - 1) / 2; i++) {
                if (min < arr[i] + arr[((N - 2) - i)]) min = arr[i] + arr[((N - 2) - i)];
            }
        }
        System.out.println(min);
    }
}
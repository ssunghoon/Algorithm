import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        햄버거를 먹을 수 있는 사람의 최대 수를 구하려면
        사람 기준 왼쪽에 있는 햄버거부터 먹어야 최대 수를 구할 수 있다.
        햄버거를 찾으면 해당 char 배열 값을 X로 바꿔서 중복을 없앤다.
         */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String str = scanner.next();
        char[] arr = str.toCharArray();

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                int start = Math.max(i - K, 0);
                int end = Math.min(i + K, N-1);
                // 왼쪽 부터 찾는다.
                for (int j = start; j <= end; j++) {
                    if (arr[j] == 'H') {
                        result++;
                        arr[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
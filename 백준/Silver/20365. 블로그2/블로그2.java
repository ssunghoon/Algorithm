import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        // 20365번 블로그2

        /*
        색깔이 B에서 R로 바뀔 때마다 체크를 해주고 1을 더해주면 답이 나온다.

        풀이방법
        color1에 문자열의 첫 번째 값인 charAt(0)을 넣어준다.
        color2에는 color1의 반대 색상을 넣어준다.
        N-1만큼 반복을 돌면서 str.charAt(i) 값과 str.charAt(i-1) 값을 비교해서 다르면 count를 올려준다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char color1 = ' ';
        char color2 = ' ';

        color1 = str.charAt(0);
        if (str.charAt(0) == 'B') {
            color1 = 'B';
            color2 = 'R';
        } else {
            color1 = 'R';
            color2 = 'B';
        }

        int count = 1;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == color2 && str.charAt(i - 1) == color1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
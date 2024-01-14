import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1541번 잃어버린 괄호

        /*
        55-50+40 -> 55-(50+40) 이렇게 계산을 해야 최소 값이 나오므로
        1. -를 기준으로 나눈다
        2. -로 나눈 첫 번째 값은 (55)는 빼면 안되기 때문에 첫 번째 값은 더해준다
        3. 나머지 요소(55, 40)들은 빼준다
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] minusArr = str.split("-");
        int sum = 0;

        String[] idx0 = minusArr[0].split("\\+");
        for (int i = 0; i < idx0.length; i++) {
            sum += Integer.parseInt(idx0[i]);
        }

        for (int i = 1; i < minusArr.length; i++) {
            String[] idxArr = minusArr[i].split("\\+");
            for (int j = 0; j < idxArr.length; j++) {
                sum -= Integer.parseInt(idxArr[j]);
            }
        }
        System.out.println(sum);
    }
}

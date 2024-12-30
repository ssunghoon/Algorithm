class Solution {
    public int solution(int n) {
        // 소수의 개수
        int count = 0;
        // 소수 체크 할 배열
        boolean[] sosu = new boolean[n + 1];
        for (int i = 2; i < sosu.length; i++) { // 2부터 마지막 숫자까지 true
            sosu[i] = true;
        }

        int root = (int)Math.sqrt(n); // n의 제곱근 (효율적으로 반복하기 위함)

        for (int i = 2; i <= root; i++) {
            for (int j = i; i * j <= n; j++) { // 각 소수값의 배수는 소수가 아니기 때문에 배수 값 제거
                sosu[i * j] = false;
            }
        }

        for (boolean sosuCount : sosu) {
            if (sosuCount == true) count++;
        }

        System.out.println(count);

        return count;
    }
}
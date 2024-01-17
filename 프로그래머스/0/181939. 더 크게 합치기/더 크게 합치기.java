class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        int answer = Integer.parseInt(A + B) > Integer.parseInt(B + A) ? Integer.parseInt(A + B)
                : Integer.parseInt(B + A);
        return answer;
    }
}
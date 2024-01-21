class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c) { // 세 숫자가 모두 같다면
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        } else if(a != b && b != c && a != c) { // 세 숫자가 모두 다르다면
            answer = a + b + c;
        } else { // 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c));            
        }
        return answer;
    }
}
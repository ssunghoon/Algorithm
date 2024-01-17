class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if ((ineq + eq).equals(">=") || (ineq + eq).equals(">!")) {
            return n >= m ? 1 : 0;
        } else {
            return n <= m ? 1 : 0;
        }
    }
}
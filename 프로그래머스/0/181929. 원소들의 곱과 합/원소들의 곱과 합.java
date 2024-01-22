class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int squareOfSum = 0;
        for (int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            squareOfSum += num_list[i];
        }
        squareOfSum = squareOfSum * squareOfSum;
        return multi < squareOfSum ? 1 : 0;
    }
}
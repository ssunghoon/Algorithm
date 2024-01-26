class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length * queries[0].length];
        int idx = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                answer[idx++] = queries[i][j];
            }
        }
        for (int i = 0; i < answer.length - 1; i++) {
            if (i % 2 == 0) {
                int tmp = arr[answer[i + 1]];
                arr[answer[i + 1]] = arr[answer[i]];
                arr[answer[i]] = tmp;
            }
        }
        return arr;
    }
}
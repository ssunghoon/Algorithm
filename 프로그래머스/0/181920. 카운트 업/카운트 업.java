import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int start_num, int end_num) {
        List list = new ArrayList();
        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }
        return list;
    }
}
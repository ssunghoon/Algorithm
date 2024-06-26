import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n) {
        List list = new ArrayList();
        list.add(n);
        int num = n;
        while (true) {
            if (num == 1) {
                return list;
            } else if (num % 2 == 0) {
                num /= 2;
                list.add(num);
            } else {
                num = 3 * num + 1;
                list.add(num);
            }
        }
    }
}
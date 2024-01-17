class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String first = my_string.substring(0, s);
        String between = my_string.substring(s, s+overwrite_string.length());
        String last = my_string.substring(s+overwrite_string.length(),my_string.length());
        return first + overwrite_string + last;
    }
}
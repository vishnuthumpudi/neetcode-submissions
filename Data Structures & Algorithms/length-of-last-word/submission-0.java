class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        String[] s_split = s.split(" ");

        return s_split[s_split.length - 1].length();
    }
}
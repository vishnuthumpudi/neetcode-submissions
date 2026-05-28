class Solution {
    public boolean isAnagram(String s, String t) {
        int len_s = s.length();
        int len_t = t.length();

        if(len_s != len_t){
            return false;
        }

        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();

        for(char ch : s.toCharArray()){
            map_s.put(ch, map_s.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            map_t.put(ch, map_t.getOrDefault(ch, 0) + 1);
        }

        return map_s.equals(map_t);
    }
}

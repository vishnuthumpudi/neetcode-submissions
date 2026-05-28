class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() || s == null || t == null){
            return false;
        }


        Map<Character, Integer> lookUp_S = new HashMap<>();

        Map<Character, Integer> lookUp_T = new HashMap<>();

        for(char ch : s.toCharArray()){
            lookUp_S.put(ch, lookUp_S.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            lookUp_T.put(ch, lookUp_T.getOrDefault(ch, 0) + 1);
        }

        return lookUp_S.equals(lookUp_T);
    }
}

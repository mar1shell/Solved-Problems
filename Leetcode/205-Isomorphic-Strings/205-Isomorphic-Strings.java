class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTranslation = new HashMap<>();
        HashMap<Character, Character> tTranslation = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currS = s.charAt(i), currT = t.charAt(i); 
            if (!sTranslation.containsKey(currS) && !tTranslation.containsKey(currT)) {
                sTranslation.put(currS, currT);
                tTranslation.put(currT, currS);
            } else if (!sTranslation.containsKey(currS) && tTranslation.containsKey(currT)) {
                return false;
            } else if (!tTranslation.containsKey(currT) || tTranslation.get(currT) != currS) {
                return false;    
            }
        }

        return true;
    }
}
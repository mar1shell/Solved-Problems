class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> codes = new HashSet<>();
        int codesSize = 1 << k; // 2 ^ k 

        for (int i = 0; i + k <= s.length(); i++) {
            codes.add(s.substring(i, i + k));

            if (codes.size() == codesSize) {
                return true;
            }
        }

        return false;
    }
}
class Solution {
    public String largestEven(String s) {
        int i = s.length() - 1;
        
        while (i >= 0 && s.charAt(i) == '1') {
            i--;
        }

        return (i >= 0) ? s.substring(0, i + 1) : "";
    }
}
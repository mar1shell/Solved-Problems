class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] sArray = s.toCharArray();
        int left = 0, right = s.length() - 1;
        char temp;

        while (left < right) {
            while (left < right && !vowels.contains(sArray[left])) {
                left++;
                System.out.println("ere");
            }

            while (left < right && !vowels.contains(sArray[right])) {
                right--;
            }

            if (left < right) {
                temp = sArray[left];
                sArray[left] = sArray[right];
                sArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(sArray);
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, Integer> unique = new HashMap<>();
        String currSortedStr;
        int currIndex = 0;

        for (String str : strs) {
            char[] currCharArray = str.toCharArray();
            Arrays.sort(currCharArray);
            currSortedStr = new String(currCharArray);

            if (unique.containsKey(currSortedStr)) {
                answer.get(unique.get(currSortedStr)).add(str);
            } else {
                ArrayList<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                unique.put(currSortedStr, currIndex);
                answer.add(anagrams);
                currIndex++;
            }
        }

        return answer;
    }
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> lastOccurance = new HashMap<>();
        List<Integer> partitionLengths = new ArrayList<>();
        int stopIndex = 0, currentCount = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (!lastOccurance.containsKey(s.charAt(i))) {
                lastOccurance.put(s.charAt(i), i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            currentCount++;
            stopIndex = Math.max(stopIndex, lastOccurance.get(s.charAt(i)));

            if (i == stopIndex) {
                partitionLengths.add(currentCount);
                currentCount = 0;
                stopIndex++;
            }
        }

        return partitionLengths;
    }
}
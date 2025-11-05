class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int[] answer = new int[2];
        int index = 0;

        for (int num: nums) {
            if (index == 2) {
                break;
            }

            if (seen.contains(num)) {
                answer[index++] = num;
            } else {
                seen.add(num);
            }
        }

        return answer;
    }
}
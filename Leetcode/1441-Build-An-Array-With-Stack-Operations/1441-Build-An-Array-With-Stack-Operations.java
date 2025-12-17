class Solution {
    private final String PUSH = "Push";
    private final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int curr = 1, currTargetIndex = 0;

        for (int i = 1; i <= n; i++) {
            if (currTargetIndex >= target.length) {
                break;
            }
            result.add(PUSH);

            if (i == target[currTargetIndex]) {
                currTargetIndex++;
            } else {
                result.add(POP);
            }
        }

        return result;
    }
}
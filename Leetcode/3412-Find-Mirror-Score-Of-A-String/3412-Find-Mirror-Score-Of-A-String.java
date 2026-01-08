class Solution {
    public long calculateScore(String s) {
        Map<Character, List<Integer>> closestMirrors = new HashMap<>();
        long totalScore = 0;

        for (int i = 0; i < s.length(); i++) {
            List<Integer> indices;
            char c = s.charAt(i);

            if (!closestMirrors.containsKey(c)) {
                char mirror = mirrorOf(c);

                if (!closestMirrors.containsKey(mirror)) {
                    indices = new ArrayList<>(List.of(i));
                    closestMirrors.put(mirrorOf(c), indices);
                } else {
                    indices = closestMirrors.get(mirror);
                    indices.add(i);             
                }
            } else {
                indices = closestMirrors.get(c);
                totalScore += (i - indices.remove(indices.size() - 1));

                if (indices.isEmpty()) {
                    closestMirrors.remove(c);
                }
            }
        }

        return totalScore;
    }

    private char mirrorOf(char c) {
        return (char) ('a' + 'z' - c);
    }
}
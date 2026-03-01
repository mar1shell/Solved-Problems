class Solution {
    public int minPartitions(String n) {
        int minPar = 0;

        for (int i = 0; i < n.length(); i++) {
            minPar = Math.max(Character.getNumericValue(n.charAt(i)), minPar);

            if (minPar == 9) {
                break;
            }
        }

        return minPar;
    }
}
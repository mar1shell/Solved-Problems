class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            return compare(a, b);
        });

        return Arrays.stream(temp).mapToInt(i -> i).toArray();
    }

    private int compare(int a, int b) {
        int aBits = Integer.bitCount(a), bBits = Integer.bitCount(b);
        System.out.printf("%d: %d  %d: %d\n", a, aBits, b, bBits);

        if (aBits != bBits) {
            return aBits - bBits;
        }

        return a - b;
    }
}
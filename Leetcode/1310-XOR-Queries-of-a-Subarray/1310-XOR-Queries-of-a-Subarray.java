class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xorSum = new int[arr.length], answer = new int[queries.length];
        
        xorSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            xorSum[i] = xorSum[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                answer[i] = xorSum[queries[i][1]];
            } else {
                answer[i] = xorSum[queries[i][1]] ^ xorSum[queries[i][0] - 1]; 
            }
        }

        return answer;
    }
}
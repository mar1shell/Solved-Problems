class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] functionsExecutionTime = new int[n], currentFunctionCall, currentStartCall;
        Deque<int[]> callStack = new ArrayDeque<>();
        int currentFunctionId, currentTimestamp;
        String currentCallType;

        for (String functionCallString : logs) {
            String[] functionCallInfos = functionCallString.split(":");
            currentFunctionId = Integer.parseInt(functionCallInfos[0]);
            currentTimestamp = Integer.parseInt(functionCallInfos[2]);
            currentCallType = functionCallInfos[1];

            if (currentCallType.equals("start")) {
                currentFunctionCall = new int[3];
                currentFunctionCall[0] = currentFunctionId;
                currentFunctionCall[1] = currentTimestamp;
                callStack.push(currentFunctionCall);
            } else {
                currentStartCall = callStack.pop();
                functionsExecutionTime[currentFunctionId] +=
                    currentTimestamp
                    - currentStartCall[1]
                    - currentStartCall[2]
                    + 1;

                if (!callStack.isEmpty()) {
                    int[] parentFunctionCall = callStack.peek();
                    
                    parentFunctionCall[2] +=
                        currentTimestamp
                        - currentStartCall[1]
                        + 1;
                }
            }
        }

        return functionsExecutionTime;
    }
}
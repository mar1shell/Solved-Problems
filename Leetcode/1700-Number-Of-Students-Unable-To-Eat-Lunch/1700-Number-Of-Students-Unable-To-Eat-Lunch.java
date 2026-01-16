class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new ArrayDeque<>();
        int currStudent, i = 0, rejects = 0;

        for (int student : students) {
            queue.offer(student);
        }

        while (i < sandwiches.length) {
            if (rejects == queue.size()) {
                break;
            }

            currStudent = queue.peek();

            queue.poll();

            if (currStudent != sandwiches[i]) {
                queue.offer(currStudent);
                rejects++;
            } else {
                rejects = 0;
                i++;
            }
        }

        return queue.size();
    }
}
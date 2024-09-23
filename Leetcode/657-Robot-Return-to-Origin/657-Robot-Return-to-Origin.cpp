class Solution {
public:
    bool judgeCircle(string moves) {
        vector<int> currPosition(2), initialPosition(2);

        for (auto i : moves) {
            switch(i) {
                case 'U':
                    currPosition[1]++;
                    break;
                case 'D':
                    currPosition[1]--;
                    break;
                case 'R':
                    currPosition[0]++;
                    break;
                case 'L':
                    currPosition[0]--;
                    break;
            }
        }

        return (currPosition == initialPosition) ? true : false;
    }
};

class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> result;
        
        for (auto c : operations) {
            if (c == "C") {
                result.pop_back();
            } else if (c == "D") {
                result.push_back(2 * result.back());
            } else if (c == "+") {
                int n = result.size();
                result.push_back(result[n - 1] + result[n - 2]);
            } else {
                result.push_back(stoi(c));
            }
        }

        int sum = 0;

        for (auto i : result) {
            sum += i;
        }

        return sum; 
    }
};

class Solution {
public:
    double average(vector<int>& salary) {
        int sum = accumulate(salary.begin(), salary.end(), 0);
        int max = *max_element(salary.begin(), salary.end());
        int min = *min_element(salary.begin(), salary.end());
        int count = salary.size() - 2;
        return (double)(sum - min - max) / count;
    }
};

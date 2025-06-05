# Intuition

The goal is to maximize profit by buying and selling stocks, given you can complete as many transactions as you'd like (but cannot hold more than one share at a time).  
Intuitively, this means we should buy whenever we expect a price to go up and sell right before it goes down.

# Approach

We simulate the process of buying and selling:

- Traverse the prices day by day.
- If the current day's price is **lower than the next day's**, it's a good opportunity to **buy**.
- If we are holding a stock and the current price is **higher than our buy price**, and:
  - It's the **last day**, or
  - The price is about to **drop tomorrow**,
    then we **sell** and record the profit.
- Repeat this process until the end of the array.

This approach ensures we capture all profitable price increases.

# Complexity

- Time complexity:  
  $$O(n)$$ — We traverse the prices list once.

- Space complexity:  
  $$O(1)$$ — We use a few variables for state (profit, holding flag, buy price).

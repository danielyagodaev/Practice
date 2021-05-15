Given a non-empty array of unique positive integers _nums_, consider the following graph:

- There are _nums.length_ nodes, labelled _nums[0]_ to _nums[nums.length - 1]_;
- There is an edge between _nums[i]_ and _nums[j]_ if and only if _nums[i]_ and _nums[j]_ share a common factor greater
  than _1_.

Return the size of the largest connected component in the graph.

**Example 1:**

- Input: nums = [4,6,15,35]
- Output: 4
  ![alt text](https://assets.leetcode.com/uploads/2018/12/01/ex1.png)

**Example 2:**

- Input: nums = [20,50,9,63]
- Output: 2
  ![alt text](https://assets.leetcode.com/uploads/2018/12/01/ex2.png)

**Example 3:**

- Input: nums = [2,3,6,7,4,12,21,39]
- Output: 8
  ![alt text](https://assets.leetcode.com/uploads/2018/12/01/ex3.png)

**Note:**

- _1 <= nums.length <= 20000_
- _1 <= nums[i] <= 100000_
Given a string _s_, partition _s_ such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of _s_.

**Example 1:**

- Input: s = "aab"
- Output: 1
- Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.

**Example 2:**

- Input: s = "a"
- Output: 0

**Example 3:**

- Input: s = "ab"
- Output: 1

**Constraints:**

- _1 <= s.length <= 2000_
- _s_ consists of lower-case English letters only.
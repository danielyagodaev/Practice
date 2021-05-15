You are given an array _target_ that consists of **distinct** integers and another integer array _arr_ that **can** have
duplicates.

In one operation, you can insert any integer at any position in _arr_. For example, if arr = _[1,4,1,2]_, you can add
_3_ in the middle and make it _[1,4,3,1,2]_. Note that you can insert the integer at the very beginning or end of the array.

Return the **minimum** number of operations needed to make _target_ a **subsequence** of _arr_.

A **subsequence** of an array is a new array generated from the original array by deleting some elements (possibly none)
without changing the remaining elements' relative order. For example, _[2,7,4]_ is a subsequence of _[4,2,3,7,2,1,4]_ 
(the underlined elements), while _[2,4,2]_ is not.

**Example 1:**

- Input: target = [5,1,3], arr = [9,4,2,3,4]
- Output: 2
- Explanation: You can add 5 and 1 in such a way that makes arr = [5,9,4,1,2,3,4], then target will be a subsequence of arr.

**Example 2:**

- Input: target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
- Output: 3

**Constraints:**

- _1 <= target.length, arr.length <= 10^5_
- _1 <= target[i], arr[i] <= 10^9_
- target contains no duplicates.
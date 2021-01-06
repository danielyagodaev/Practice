You are given an array of _k_ linked-lists _lists_, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

**Example 1:**

- Input: lists = [[1,4,5],[1,3,4],[2,6]]
- Output: [1,1,2,3,4,4,5,6]
- Explanation:
  - The linked-lists are:
[
1->4->5,
1->3->4,
2->6
]
  - merging them into one sorted list:
1->1->2->3->4->4->5->6

**Example 2:**

- Input: lists = []
- Output: []

**Example 3:**

- Input: lists = [[]]
- Output: []

**Constraints:**

- _k == lists.length_
- _0 <= k <= 10^4_
- _0 <= lists[i].length <= 500_
- _-10^4 <= lists[i][j] <= 10^4_
- _lists[i]_ is sorted in ascending order.
- The sum of _lists[i].length_ won't exceed _10^4_.

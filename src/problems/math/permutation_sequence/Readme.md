The set _[1, 2, 3, ..., n]_ contains a total of _n!_ unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for _n = 3_:

1) "123"
2) "132"
3) "213"
4) "231"
5) "312"
6) "321"

Given _n_ and _k_, return the _kth_ permutation sequence.

**Example 1:**

- Input: n = 3, k = 3
- Output: "213"

**Example 2:**

- Input: n = 4, k = 9
- Output: "2314"

**Example 3:**

- Input: n = 3, k = 1
- Output: "123"

**Constraints:**

- _1 <= n <= 9_
- _1 <= k <= n!_
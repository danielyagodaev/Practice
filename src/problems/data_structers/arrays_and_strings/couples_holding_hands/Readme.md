_N_ couples sit in _2N_ seats arranged in a row and want to hold hands. We want to know the minimum number of swaps so
that every couple is sitting side by side. A swap consists of choosing **any** two people, then they stand up and
switch seats.

The people and seats are represented by an integer from _0_ to _2N-1_, the couples are numbered in order, the first
couple being _(0, 1)_, the second couple being _(2, 3)_, and so on with the last couple being _(2N-2, 2N-1)_.

The couples' initial seating is given by _row[i]_ being the value of the person who is initially sitting in the _i-th_ 
seat.

**Example 1:**

- Input: row = [0, 2, 1, 3]
- Output: 1
- Explanation: We only need to swap the second (row[1]) and third (row[2]) person.

**Example 2:**

- Input: row = [3, 2, 0, 1]
- Output: 0
- Explanation: All couples are already seated side by side.

**Note:**

- _len(row)_ is even and in the range of _[4, 60]_.
- _row_ is guaranteed to be a permutation of _0...len(row)-1_.
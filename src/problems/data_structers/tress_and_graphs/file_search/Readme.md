You are given an assignment to sort out the files of your department today.

A file contains various records. Each record has an (ID, Parent ID).

To make your task easier, you decided to separate records into different sets.

If a set contains a record with (ID, Parent ID) - (X, Y), then both X and Y must be present in the set.

There are **A** records. You are also given a 2D array **B** of dimensions **N x 2**,

where each row is record's (ID, Parent ID).

You have to find the maximum number of sets you can divide the records into.

**Problem Constraints**

- _1 <= A, N <= 10^5_
- _1 <= B[i][0], B[i][1] <= A_
- There can be duplicate records.
- There can be two records _(X, Y)_ and _(Y, X)_.

**Input Format**

- The first argument is the integer _A_.
- The second argument is the 2D integer array _B_.

**Output Format**

Return a single integer denoting the maximum number of sets you can break the record into.

**Example Input**

Input 1:

- A = _4_
- B = _[[1, 2], [3, 4]]_

Input 2:

- A = _4_
- B = _[[1, 2], [3, 4], [2, 4]]_

**Example Output**

Output 1: 

2

Output 2: 

1

**Example Explanation**

Explanation 1:

We can create two sets _(1, 2)_, _(3, 4)_. Since, _(1, 2)_ need to be together and _(3, 4)_.

Explanation 2:

We can only have _1_ set because _(1, 2)_ need to be together _(2, 4)_ need to be together.

Hence, _(1, 2, 4)_ need to be together. Similarly, _(1, 2, 3, 4)_ need to be together. Therefore, the answer is _1_.

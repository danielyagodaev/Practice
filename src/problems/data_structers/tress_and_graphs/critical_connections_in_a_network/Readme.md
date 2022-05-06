There are n servers numbered from _0_ to _n - 1_ connected by undirected server-to-server connections forming a 
network where _connections[i] = [ai, bi]_ represents a connection between servers _ai_ and _bi_. Any server can reach 
other servers directly or indirectly through the network.

A critical connection is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.

**Example 1:**

![alt text](https://assets.leetcode.com/uploads/2019/09/03/1537_ex1_2.png)

- Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
- Output: [[1,3]]
- Explanation: [[3,1]] is also accepted.

**Example 2:**

- Input: n = 2, connections = [[0,1]]
- Output: [[0,1]]

**Constraints:**

- _2 <= n <= 10^5_
- _n - 1 <= connections.length <= 10^5_
- _0 <= ai, bi <= n - 1_
- _ai != bi_
- There are no repeated connections.
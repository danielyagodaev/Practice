You have a _grid_ of size _n x 3_ and you want to paint each cell of the grid with exactly one of the three colors:
**Red**, **Yellow**, or **Green** while making sure that no two adjacent cells have the same color (i.e., no two cells
that share vertical or horizontal sides have the same color).

Given _n_ the number of rows of the grid, return the number of ways you can paint this _grid_. As the answer may grow
large, the answer **must be** computed modulo _10^9 + 7_.

**Example 1:**

![alt text](https://assets.leetcode.com/uploads/2020/03/26/e1.png)

- Input: n = 1
- Output: 12
- Explanation: There are 12 possible way to paint the grid as shown.

**Example 2:**

- Input: n = 2
- Output: 54

**Example 3:**

- Input: n = 3
- Output: 246

**Example 4:**

- Input: n = 7
- Output: 106494

**Example 5:**

- Input: n = 5000
- Output: 30228214

**Constraints:**

- _n == grid.length_
- _grid[i].length == 3_
- _1 <= n <= 5000_
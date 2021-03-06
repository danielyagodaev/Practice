A city's **skyline** is the outer contour of the silhouette formed by all the buildings in that city when viewed from a
distance. Given the locations and heights of all the buildings, return the **skyline** formed by these buildings
collectively.

The geometric information of each building is given in the array _buildings_ where
_buildings[i] = [lefti, righti, heighti]_:

- _lefti_ is the x coordinate of the left edge of the _ith_ building.
- _righti_ is the x coordinate of the right edge of the _ith_ building.
- _heighti_ is the height of the _ith_ building.

You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height _0_.

The **skyline** should be represented as a list of "key points" **sorted by their x-coordinate** in the form
_[[x1,y1],[x2,y2],...]_. Each key point is the left endpoint of some horizontal segment in the skyline except the last
point in the list, which always has a y-coordinate 0 and is used to mark the skyline's termination where the rightmost
building ends. Any ground between the leftmost and rightmost buildings should be part of the skyline's contour.

**Note:** There must be no consecutive horizontal lines of equal height in the output skyline. For instance,
_[...,[2 3],[4 5],[7 5],[11 5],[12 7],...]_ is not acceptable; the three lines of height 5 should be merged into one in
the final output as such: _[...,[2 3],[4 5],[12 7],...]_

**Example 1:**

![alt text](https://assets.leetcode.com/uploads/2020/12/01/merged.jpg)
- Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
- Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
- Explanation:
- - Figure A shows the buildings of the input.
- - Figure B shows the skyline formed by those buildings. The red points in figure B represent the key points in the output list.

Example 2:

- Input: buildings = [[0,2,3],[2,5,3]]
- Output: [[0,3],[5,0]]


**Constraints:**

- _1 <= buildings.length <= 10^4_
- _0 <= lefti < righti <= 2^31 - 1_
- _1 <= heighti <= 2^31 - 1_
- _buildings_ is sorted by _lefti_ in non-decreasing order.
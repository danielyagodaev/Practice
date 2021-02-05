Given two strings _s_ and _t_, return the minimum window in _s_ which will contain all the characters in _t_. If there
is no such window in _s_ that covers all characters in _t_, return the empty string _""_.

**Note** that If there is such a window, it is guaranteed that there will always be only one unique minimum window in
_s_.

**Example 1:**

- Input: s = "ADOBECODEBANC", t = "ABC"
- Output: "BANC"

**Example 2:**

- Input: s = "a", t = "a"
- Output: "a"

**Constraints:**

- _1 <= s.length, t.length <= 10^5_
- _s_ and _t_ consist of English letters.

**Follow up:** Could you find an algorithm that runs in _O(n)_ time?
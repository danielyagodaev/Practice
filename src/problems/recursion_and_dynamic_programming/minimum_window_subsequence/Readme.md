Given strings _s_ and _t_, find the minimum (contiguous) substring _w_ of _s_, so that _t_ is a subsequence of _w_.

If there is no such window in _s_ that covers all characters in _t_, return the empty string "". If there are multiple
such minimum-length windows, return the one with the left-most starting index.

**Example:**

- Input: s = "abcdebdde", t = "bde"
- Output: "bcde"
- Explanation: There are many substrings with "bde" but the smallest amongst them is "bcde" and "bdde" of length 4.
  Out of these 2, "bcde" occurs first, Hence it is the answer.
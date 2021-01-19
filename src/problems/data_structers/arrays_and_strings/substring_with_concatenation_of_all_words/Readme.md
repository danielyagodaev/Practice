You are given a string _s_ and an array of strings _words_ of **the same length**. Return all starting indices of
_substring(s)_ in _s_ that is a concatenation of each word in _words_ **exactly once, in any order**, and **without any
intervening characters**.

You can return the answer in **any order**.

**Example 1:**

- Input: s = "barfoothefoobarman", words = ["foo","bar"]
- Output: [0,9]
- Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.

**Example 2:**

- Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
- Output: []

**Example 3:**

- Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
- Output: [6,9,12]

**Constraints:**

- _1 <= s.length <= 10^4_
- _s_ consists of lower-case English letters.
- _1 <= words.length <= 5000_
- _1 <= words[i].length <= 30_
- _words[i]_ consists of lower-case English letters.

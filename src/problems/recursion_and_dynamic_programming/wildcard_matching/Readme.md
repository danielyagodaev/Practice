Given an input string _(s)_ and a pattern _(p)_, implement wildcard pattern matching with support for _'?'_ and _'*'_ 
where:

- _'?'_ Matches any single character.
- _'*'_ Matches any sequence of characters (including the empty sequence).

The matching should cover the **entire** input string (not partial).

**Example 1:**

- Input: s = "aa", p = "a"
- Output: false
- Explanation: "a" does not match the entire string "aa".

**Example 2:**

- Input: s = "aa", p = "*"
- Output: true
- Explanation: '*' matches any sequence.

**Example 3:**

- Input: s = "cb", p = "?a"
- Output: false
- Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.

**Example 4:**

- Input: s = "adceb", p = "*a*b"
- Output: true
- Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".

**Example 5:**

- Input: s = "acdcb", p = "a*c?b"
- Output: false

**Constraints:**

- _0 <= s.length, p.length <= 2000_
- _s_ contains only lowercase English letters.
- _p_ contains only lowercase English letters, _'?'_ or _'*'_.
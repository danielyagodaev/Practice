Two strings _X_ and _Y_ are similar if we can swap two letters (in different positions) of _X_, so that it equals _Y_.
Also two strings _X_ and _Y_ are similar if they are equal.

For example, _"tars"_ and _"rats"_ are similar (swapping at positions _0_ and _2_), and _"rats"_ and _"arts"_ are 
similar, but _"star"_ is not similar to _"tars"_, _"rats"_, or _"arts"_.

Together, these form two connected groups by similarity: _{"tars", "rats", "arts"}_ and _{"star"}_.  Notice that
_"tars"_ and _"arts"_ are in the same group even though they are not similar.  Formally, each group is such that a word
is in the group if and only if it is similar to at least one other word in the group.

We are given a list _strs_ of strings where every string in _strs_ is an anagram of every other string in _strs_. How 
many groups are there?

**Example 1:**

- Input: strs = ["tars","rats","arts","star"]
- Output: 2

**Example 2:**

- Input: strs = ["omv","ovm"]
- Output: 1

**Constraints:**

- _1 <= strs.length <= 300_
- _1 <= strs[i].length <= 300_
- _strs[i]_ consists of lowercase letters only.
- All words in _strs_ have the same length and are anagrams of each other.
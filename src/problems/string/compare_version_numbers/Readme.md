Given two version numbers, _version1_ and _version2_, compare them.

Version numbers consist of **one or more revisions** joined by a dot _'.'_. Each revision consists of **digits** and may
contain leading **zeros**. Every revision contains **at least one character**. Revisions are **0-indexed from left to
right**, with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example
_2.5.33_ and _0.1_ are valid version numbers.

To compare version numbers, compare their revisions in _left-to-right order_. Revisions are compared using their 
**integer value ignoring any leading zeros**. This means that revisions _1_ and _001_ are considered **equal**. If a version number does not
specify a revision at an index, then **treat the revision as** _0_. For example, version _1.0_ is less than version
_1.1_ because their revision 0s are the same, but their revision 1s are _0_ and _1_ respectively, and _0 < 1_.

Return the following:

- If _version1 < version2_, return _-1_.
- If _version1 > version2_, return _1_.
- Otherwise, return _0_.

**Constraints:**

- _1 <= version1.length, version2.length <= 500_
- _version1_ and _version2_ only contain digits and _'.'_.
- _version1_ and _version2_ are **valid version numbers**.
- All the given revisions in _version1_ and _version2_ can be stored in a **32-bit integer**.
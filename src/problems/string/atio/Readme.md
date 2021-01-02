Implement _atoi_ which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is
found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical
digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no
effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists
because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

**Note:**

- Only the space character _' '_ is considered a whitespace character.
- Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
  _[−2^31,  2^31 − 1]_. If the numerical value is out of the range of representable values, _2^31 − 1_ or _−2^31_ is
  returned.

**Constraints:**

- _0 <= s.length <= 200_
- _s_ consists of English letters (lower-case and upper-case), digits, _' '_, _'+'_, _'-'_ and _'.'_.
# Counting Strings

You are given a string s consisting of upper case Latin alphabets, i.e. from 'A' to 'Z'. 
Your task is to find how many strings t with length equal to that of S, also consisting of upper case Latin 
alphabet are there satisfying the following conditions:

- String t is lexicographical larger than s
- When you write both s and t in the reverse order, t is still lexicographical larger than s.

Find out number of such strings t. As the answer could be very large, output it modulo 10<sup>9</sup> + 7

## Input

- The only line of input contains string s

## Output

Output a single line containing an integer corresponding to the result in modulo 10<sup>9</sup> + 7

## Constraints

- 1 ≤ |S| ≤ 10<sup>5</sup>

## Example

### Input:

ZAZ

### Output:

25

### Input:

XYZ

### Output:

5

## Explanation

### Case 1

To make a valid string t, you can just replace the letter A in S by any other letter, e.g. by replacing 'A' by 'B', we get t = ZBZ. 
Note that ZBZ is lexicographically larger than ZAZ. Reverse of t (i.e. ZBZ) is also lexicographically larger than reverse of s (i.e. ZAZ).

### Case 2

There are 5 valid strings: YYZ, ZYZ, XZZ, YZZ, ZZZ.

# Bear and Extra Number

A sequence is called nice if its elements are distinct consecutive numbers, possibly in changed order. 
For example, both (6, 7, 8) and (15, 13, 16, 14) are nice, while (4, 6), (4, 5, 5, 6) and (15, 16, 15) are not.

Limak has a nice sequence. While he was in school today, someone inserted one extra number in the sequence. 
Limak has just returned and realized that the sequence isn't nice anymore! 
He wants to remove the inserted number and make his sequence nice again. Can you help him to find the number that he should remove?

Formally, in each test case you are given a sequence of N numbers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>. 
Your task is to find the value X, such that removing one occurrence of X would make the sequence nice. 
It's guaranteed that exactly one solution exists.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains an integer N denoting the size of the new sequence.
- The second line of a test case contains N integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the new sequence.

## Output

For each test case, output a single line containing one integer — a number that should be removed from the given sequence.

## Constraints

- 1 ≤ T ≤ 10
- 3 ≤ N ≤ 10<sup>5</sup>
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>
- The given sequence isn't nice.
- There is exactly one solution.

## Example

### Input:

4

5

45 42 46 48 47

3

7 7 8

8

12 156 157 158 159 160 161 162

4

8 7 10 6

### Output:

42

7

12

10

## Explanation

### Case 1

The sequence A is (45, 42, 46, 48, 47). 
We should remove the number 42, and the remaining numbers will form a nice sequence (45, 46, 48, 47).

### Case 2

We should remove one of two 7's to get the sequence (7, 8), which is nice.

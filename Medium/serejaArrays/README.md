# Sereja and Arrays

Sereja have an array that consist of n integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub> (0 ≤ a<sub>i</sub> ≤ 1). 
Sereja can make next operation:

- fix some integer i (1 ≤ i ≤ n - k + 1)
- subtract 1 from values: a<sub>i</sub>, a<sub>i + 1</sub>, ..., a<sub>i + k - 1</sub>

Sereja call array a good if it is possible to make some operations, that he can and get array that contain only zeros. 
Now Sereja interested in next question: how many good arrays a with length n exist?

## Input

- First line contain integer T — number of testcases. T tests follow. 
- Each testcase is given by two integers n and k.

## Output

- 1 ≤ T ≤ 10
- 1 ≤ k ≤ n ≤ 10<sup>5</sup>

## Constraints

For each testcase output answer modulo 10<sup>9</sup> + 7.

## Example

### Input:

3

3 3

5 2

5 1

### Output:

2

8

32

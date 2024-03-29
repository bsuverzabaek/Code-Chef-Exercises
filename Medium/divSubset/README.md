# Divisible Subset

You are given a multiset of N integers. Please find such a nonempty subset of it that the sum of the subset's elements is divisible by N. 
Otherwise, state that this subset doesn't exist.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. 
- The first line of each test consists of a single integer N - the size of the multiset.
- The second line of each test contains N single space separated integers - the multiset's elements.

## Output

For each test case output:

- -1 if the required subset doesn't exist
- If the required subset exists, output two lines. 
Output the size of the subset on the first line and output the list of indices of the multiset's element that form the required subset. 
Of course, any number can be taken in the subset no more than once.

If there are several such subsets, you can output any.

## Constraints

- 1 <= The sum of N over all the test cases <= 10<sup>5</sup>
- Each element of the multiset is a positive integer, not exceeding 10<sup>9</sup>
- 1 <= N <= 10<sup>5</sup>

## Example

### Input:

1

3

4 6 10

### Output:

1

2

## Explanation

We can pick {6} as the subset, then its sum is 6 and this is divisible by 3 - the size of the initial multiset.

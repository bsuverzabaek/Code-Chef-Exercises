# Chang and Bitwise OR

Chang is a big fan of bitwise operations. 
As he was sitting in a boring lecture, he thought of a simple problem but had a tough time figuring out the solution. Help him to solve it. 
The problem is as follows.

Given a list of N non-negative integers, you perform the following operation on this list.

- Select any subsequence of integers from the list and remove the elements of that subsequence. The cost incurred will be Bitwise OR of the elements.

Your task is to remove all the integers from the list by applying the above operation as many times as you want. 
You want to incur the minimum total cost at the end. Total cost is the sum of all the costs incurred while removing subsequences.

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- The first line of the each test case contains a single integer N denoting the number of integers in the list.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the integers in the given list.

## Output

For each test case, output answer in a separate line.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 105
- 0 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

1

2

1 2

### Output:

3

## Explanation

### Case 1

We can first remove 1 from the list and then 2. Thus, the total cost comes out to 3.

The other possible way is to choose the subsequence 1, 2, and remove it. The Bitwise OR of 1 and 2 is 3. So the cost incurred will be 3 in this case too.

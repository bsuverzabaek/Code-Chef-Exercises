# Physics Class

The Physics teacher in Tanu's class is teaching concepts of a bouncing ball. 
The rubber ball that she is using has the property that if the ball is dropped from height H then, it bounces back to maximum height H/F. 
So after first bounce it rises up to maximum height H/F, after second 
bounce to maximum height H/F<sup>2</sup>, after third bounce to maximum height H/F<sup>3</sup>, and so on.

The class has N children, and the teacher wants to select two 
children such that when the taller child drops the ball from his height, ball reaches a maximum height equal to the 
height of the shorter child after some (possibly zero) number of bounces. 

Note that zero bounces mean heights of the two children will be same. 
Given the heights of the children in the class Height[i], can you tell how many ways are there for the teacher to select two children for the demonstration? 

Note that when heights are same, the pair is only counted once (See first example for further clarification).

## Input

- First line contains T, number of testcases. Then 2*T lines follow, 2 per testcase
- First line of each testcase consists of two space-separated intergers N and F
- Second line of each testcase contains N space-separated integers representing the array Height

## Output

For each testcase, print a single line containing the answer to the problem

## Constraints

- 1 ≤ T ≤ 100 
- 1 ≤ N ≤ 10<sup>4</sup> 
- 2 ≤ F ≤ 10<sup>9</sup>
- 1 ≤ Height[i] ≤ 10<sup>9</sup>

## Example

### Input:

2

3 2

2 2 2

3 2

2 1 4

### Output:

3

3

## Explanation

### Case 1

In the first case, the three pairs are (child 1, child 2), (child 2, child 3) and (child 1, child 3).

### Case 2

For the second case also, the three pairs are (child 1, child 2), (child 2, child 3) and (child 1, child 3).

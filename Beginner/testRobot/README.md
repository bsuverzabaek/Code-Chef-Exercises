# Testing Robot

Chef has bought a new robot, which will be used for delivering dishes to his customers. He started testing the robot by letting it move on a line.

Initially, the robot is placed at the coordinate x=X. 
Then, it should execute a sequence of N commands, described by a string S with length N. 
Each character of this string is either 'L' or 'R', denoting that the robot should 
walk one step to the left (decreasing x by 1) or to the right (increasing x by 1), respectively.

How many distinct points are visited by the robot when it has executed all the commands? 
A point p is visited by the robot if p is an integer and the robot's position before or after executing some command is x=p.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains two space-separated integers N and X.
- The second line contains a single string S with length N.

## Output

For each test case, print a single line containing one integer ― the number of points visited by the robot.

## Constraints

- 1≤T≤100
- 1≤N≤100
- |X|≤1,000,000
- S contains only characters 'L' and 'R'

## Example

### Input:

2

6 10

RRLLLL

2 0

LL

### Output:

5

3

## Explanation

### Case 1

The robot followed the path 10→11→12→11→10→9→8.

### Case 2

The robot followed the path 0→−1→−2.

# Chef Chick

Chef Chick loves to jump a lot. Once, it realised that it was on an infinitely long road, and decided to travel along this road by jumping.

Let's view the road as the x-axis in a 1D coordinate system. 
Initially, Chef Chick is at the coordinate x=0, and it wants to move only in the positive x-direction. 
Moreover, Chef Chick has N favourite integers a<sub>1</sub>,a<sub>2</sub>,…,a<sub>N</sub>, and it wants to jump on the 
coordinates that are multiples of these favourite numbers — when its current position is x, it jumps to the 
smallest coordinate y>x such that y is an integer multiple of at least one of the values a<sub>1</sub>,a<sub>2</sub>,…,a<sub>N</sub>; the length 
of such a jump is y−x.

This way, Chef Chick keeps jumping along the road forever in the positive x-direction. 
You need to find the length of the longest jump it will make, i.e. the largest integer d such that 
Chef Chick makes at least one jump with length d and never makes any jump with a greater length. 
It can be proved that such an integer always exists.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each test case contains a single integer N.
- The second line contains N space-separated integers a<sub>1</sub>,a<sub>2</sub>,…,a<sub>N</sub>.

## Output

For each test case, print a single line containing one integer — the length of the longest jump that Chick will make.

## Constraints

- 1≤T≤100
- 1≤N≤100
- 1≤a<sub>i</sub>≤10<sup>5</sup> for each valid i
- a<sub>1</sub>,a<sub>2</sub>,…,a<sub>N</sub> are pairwise distinct

## Example

### Input:

1

2

2 3

### Output:

2

## Explanation

### Case 1

The sequence of coordinates on which Chef Chick would jump starts with (0,2,3,4,6,…). 
A longest jump is e.g. from 4 to 6, with length 2.

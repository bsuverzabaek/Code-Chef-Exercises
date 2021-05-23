# Arithmetic Progressions

Given N integers A<sub>1</sub>, A<sub>2</sub>, … A<sub>N</sub>, Dexter wants to know how many ways he can choose three 
numbers such that they are three consecutive terms of an arithmetic progression.

Meaning that, how many triplets (i, j, k) are there such that 1 ≤ i < j < k ≤ N and A<sub>j</sub> - A<sub>i</sub> = A<sub>k</sub> - A<sub>j</sub>.

So the triplets (2, 5, 8), (10, 8, 6), (3, 3, 3) are valid as they are three consecutive terms of an arithmetic progression. 
But the triplets (2, 5, 7), (10, 6, 8) are not.

## Input

- First line of the input contains an integer N. 
- Then the following line contains N space separated integers A<sub>1</sub>, A<sub>2</sub>, …, A<sub>N</sub>.

## Output

- 3 ≤ N ≤ 100000
- 1 ≤ A<sub>i</sub> ≤ 30000

## Constraints

Output the number of ways to choose a triplet such that they are three consecutive terms of an arithmetic progression.

## Example

### Input:

10

3 5 3 6 3 4 10 4 5 2

### Output:

9

## Explanation

The followings are all 9 ways to choose a triplet

1 : (i, j, k) = (1, 3, 5), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 3, 3)

2 : (i, j, k) = (1, 6, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

3 : (i, j, k) = (1, 8, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

4 : (i, j, k) = (3, 6, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

5 : (i, j, k) = (3, 8, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

6 : (i, j, k) = (4, 6, 10), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (6, 4, 2)

7 : (i, j, k) = (4, 8, 10), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (6, 4, 2)

8 : (i, j, k) = (5, 6, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

9 : (i, j, k) = (5, 8, 9), (A<sub>i</sub>, A<sub>j</sub>, A<sub>k</sub>) = (3, 4, 5)

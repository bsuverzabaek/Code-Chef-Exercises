# Sereja and D

Sereja has an array consisting of n integers a<sub>1</sub>≤a<sub>2</sub>≤…≤a<sub>n</sub>. 
Based on this array, he has to answer m queries represented by pairs integers t and d.

The answer for a query is the smallest integer i for which there exist some k (i≤k) such that a<sub>i</sub>+d≥a<sub>i+1</sub>, 
a<sub>i+1</sub>+d≥a<sub>i+2</sub>, …, a<sub>k−1</sub>+d≥a<sub>k</sub>, a<sub>k</sub>≤t and a<sub>k+1</sub>>t (if it exists).

Help Sereja find the answer for each query.

## Input

- First line of input contains a single integer n
- Next line contain n space separated integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>.
- Next line contains a single integer m.
- Next m lines contain pairs of integers representing the queries.

## Output

For each query, output the answer on a separate line.

## Constraints

- 1≤n,m≤10<sup>5</sup>
- 1≤a<sub>i</sub>≤10<sup>6</sup>
- a<sub>1</sub>≤t≤10<sup>6</sup>
- 0≤d≤10<sup>6</sup>

## Example

### Input:

5

1 2 3 10 50

6

1 1

5 3

11 7

100000 1

1000000 1000000

11 6

### Output:

1

1

1

5

1

4

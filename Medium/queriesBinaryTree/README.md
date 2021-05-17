# Queries on a Binary Tree

Let's consider a rooted binary tree with the following properties:

- The number of nodes and edges in the tree is infinite
- The tree root is labeled by 1
- A node labeled by v has two children: 2⋅v (the left child of v), and 2⋅v+1 (the right child of v).

Here is an image of the first several layers of such a tree:

<img width="298" alt="Screen Shot 2021-05-16 at 9 54 30 PM" src="https://user-images.githubusercontent.com/69542867/118439327-01bcb180-b6a3-11eb-95c9-6af9681a93ea.png">

Let's consider four operations that you are allowed to apply during the tree traversal:

- move to the left child - move from v to 2⋅v
- move to the right child - move from v to 2⋅v+1
- move to the parent as a left child - move from v to v/2 if v is an even integer
- move to the parent as a right child - move from v to (v−1)/2 if v is an odd integer

It can be proven, that for any pair of nodes u and v, there is only one sequence of 
commands that moves from u to v and visits each node of the tree at most once. 
Let's call such a sequence of commands a path configuration for a pair of nodes (u,v).

You are asked to process a series of the following queries:

You are given three integers n, u, and v (1≤u,v≤n). 
Count the pairs of nodes (w,t) (1≤w,t≤n) such that the path configuration for (w,t) is the same with the path configuration for (u,v).

## Input

- The first line of input contains a single integer Q, denoting the number of queries to process.
- Each of the next Q lines contains three space-separated integers n, u, and v, denoting a query.

## Output

For each query, print the answer on a separate line.

## Constraints

- 1≤Q≤2⋅10<sup>4</sup>
- 1≤u,v≤n≤10<sup>9</sup>

## Example

### Input:

3

11 9 11

10 2 2

8 1 8

### Output:

2

10

1

## Explanation

### Case 1

In the first query from the example test case, you should count pairs (5,7) and (9,11).

### Case 2

In the second query from the example test case, you should 
count the following pairs: (1,1), (2,2), (3,3), (4,4), (5,5), (6,6), (7,7), (8,8), (9,9). and (10,10).

### Case 3

In the third query from the example test case, you should only count a pair (1,8).

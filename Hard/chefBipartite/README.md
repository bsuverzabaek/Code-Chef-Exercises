# Chef and Bipartite Graphs

Chef is very interested in studying biparite graphs. 
Today he wants to construct a bipartite graph with n vertices each, on the two parts, and with total number of edges equal to m. 
The vertices on the left are numbered from 1 to n. And the vertices on the right are also numbered from 1 to n. 
He also wants the degree of every vertex to be greater than or equal to d, and to be lesser than or equal to D. ie. for all v, d ≤ deg(v) ≤ D.

Given four integers, n, m, d, D, you have to help Chef in constructing some bipartite graph satisfying this property. 
If there does not exist any such graph, output -1.

## Input

- First line of the input contains an integer T denoting the number of test cases. T test cases follow.
- The only line of each test case contains four space separated integers n, m, d, D.

## Output

For each test case, output -1 if there is no bipartite graph satisfying this property. 
Otherwise output m lines, each of the lines should contain two integers u, v denoting that there is an edge 
between vertex u on the left part and vertex v on the right part. 
If there can be multiple possible answers, you can print any. 
Note that the bipartite graph should not have multi-edges.

## Constraints

- 1 ≤ T, n ≤ 100
- 1 ≤ d ≤ D ≤ n
- 0 ≤ m ≤ n * n

## Example

### Input:

2

2 3 1 2

2 3 1 1  

### Output:

1 1

2 2

1 2
$
-1

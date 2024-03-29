# Bear and Ladder

Bearland has infinitely many cities, numbered starting from 1. Some pairs of cities are connected with bidirectional roads:

- There are roads 1-2, 3-4, 5-6, 7-8, and so on (there is a road between cities 2*i+1 and 2*i+2 for every non-negative integer i).
- There are roads 1-3, 3-5, 5-7, 7-9, ... (between every two consecutive odd numbers).
- There are roads 2-4, 4-6, 6-8, 8-10, ... (between every two consecutive even numbers).

This is how the first few cities and roads between them look like:

<img width="226" alt="Screen Shot 2021-07-05 at 11 38 39 PM" src="https://user-images.githubusercontent.com/69542867/124551100-e3e01300-ddee-11eb-99d5-9e496b9f2625.png">

You are given Q queries. In each query, for the given pair of different cities a and b, you should check if there is a road between them. 
For each query, print "YES" or "NO" accordingly.

## Input

- The first line of the input contains an integer Q, denoting the number of queries.
- Each of the following Q lines contains two distinct integers a and b, denoting two cities in one query.

## Output

For each query, output a single line containing the answer — "YES" if there is a road between the given cities a and b, and "NO" otherwise (without the quotes).

## Constraints

- 1 ≤ Q ≤ 1000
- 1 ≤ a, b ≤ 10<sup>9</sup>
- a ≠ b

## Example

### Input:

7

1 4

4 3

5 4

10 12

1 3

999999999 1000000000

17 2384823

### Output:

NO

YES

NO

YES

YES

YES

NO

## Explanation

In the example test, the answer is "YES" for pairs (4, 3), (10, 12), (1, 3) and (999999999, 1000000000). Roads 3-4 and 1-3 you can see on the drawing in the statement.

The answer is "NO" for example for a pair (1, 4), because there is no road between cities 1 and 4.

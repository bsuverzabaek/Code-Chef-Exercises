# Winning Strategy

You are given an array of n integers and there are 2 people: P1 and P2. 

Each person picks up **any** one element and adds its value to their score. **Initially the score of both** P1 **and** P2 **is** 0. 
However the person who plays second can take two elements in his/her first try and then both will take one element in alternate turns. 

Example: if P1 goes first, then the pickup sequence can look like: 

                                                 P1→P2→P2→P1→P2→P1→P2....
  
Each person wants to maximize his/her score and both of them play optimally. 

P1 wants to win and is asking for your help. Tell whether P1 should play "first" or "second". 
If both of them will get the same score independent of who plays first, then output “draw”. 

Note: Each element can be taken only once (i.e. once it is taken by some person, it cannot be taken again).

## Input

- First line contains an integer t. The number of test cases.
- First line of each test case contains an integer n. The number of elements in the array.
- Second line of each test case contains n space separated integers a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub> ... a<sub>n</sub>.

## Output

For each test case, print one line containing one of the following word **without quotes**:
- “**first**” if P1 should play first.
- “**second**” if P1 should play second.
- “**draw**” if both of them will get the same score independent of who plays first.

## Constraints

- 1≤t≤15 
- 1≤n≤10<sup>4</sup>
- 1≤a<sub>i</sub>≤10<sup>9</sup>, where 1≤i≤n

## Example

### Input:

2

3

1 1 1

4

1 1 1 1

### Output:

second

draw

## Explanation

### Case 1

In the first test case, the person who plays first will get the total sum = 1 since the person who plays second will take both the remaining 1s. 
Hence P1 should play second. 

### Case 2

In the second test case, both will get the sum = 2 so it doesn't matter who plays first. 
It will always result in draw.

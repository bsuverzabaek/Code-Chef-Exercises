# Money Matters

The Government of Byteland has decide to issue new currency notes with special protection features so as to commemorate a great mathematician. 

It has decided to issue notes summing up to N and all the sums from 1 to N should only made by selecting some of the notes in only one unique way. 

With n = 5 the sets {1,1,1,1,1}, {1,2,2}, {1,1,3} are valid. Invalid sets are 

-{1,1,1,2} because 2 can be made by {1,1} and {2}and also 3 by {1,1,1} and {1,2} 

-{1,2,4} because all from 1 to 5 can be uniquely made but the sum is not 5. 

## Input

- First line contains T, the number of test cases. 
- Each test case contains a integer N in one line.

## Output

Output the solution of each test case on a line.

## Constraints

- 1<=T<=1000
- N<=10<sup>9</sup>

## Example

### Input:

2

10

1000

### Output:

1

13

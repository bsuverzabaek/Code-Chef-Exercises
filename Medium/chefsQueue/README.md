# Chefs in Queue

All the chefs (except the Head Chef) are standing in queue to submit their bills. The chefs have different seniority. 
In all there are N chefs of K different seniority levels. 
These are given to you in an array, where A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denote the seniority of chefs in the queue. 
A<sub>N</sub> denotes front of the queue and A<sub>1</sub> denotes end of the queue.

Head Chef gets an interesting thought past his head. 
He begins to think what if every chef starting from the end of the queue begins to delegate his job of submitting bills to a chef 
least ahead of him in the queue but junior to him. 
The Head Chef's fearfulness of this scenario is f = i2 - i1 + 1, where i1 is the index of chef in queue and i2 is the index of the junior chef. 
Head Chef's total fearfulness of chaos is the product of all the fearfulness in Head Chef's mind. 
Note if a chef has no junior ahead of him/her in the queue then Head Chef's fearfulness for this Chef is 1.

You are required to find the Head Chef's total fearfulness given an arrangement of Chef's in a queue. 
Since this number can be quite large output it modulo 1000000007.

## Input

- The first line contains two integers N and K denoting the number of chefs and the number of seniority levels. 
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting the seniority of chefs in the queue. 

A<sub>N</sub> denotes front of the queue and A<sub>1</sub> denotes end of the queue.

## Output

Output a single integer denoting the total fearfulness of the Head Chef.

## Constraints

- 1 ≤ N ≤ 1000000
- 2 ≤ K ≤ 100000
- 1 ≤ A<sub>i</sub> ≤ 1000000

## Example

### Input:

4 2

1 2 1 2

### Output:

2

## Explanation

### Case 1

Only the second chef has a junior in front of him and the fearfulness he causes to the head chef is 3 - 2 + 1 = 2. 
Every other chef causes a fearfulness of 1 for the Head Chef.

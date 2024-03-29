# Rearranging Cartons

Your school has ordered some equipment that has been delivered in a number of very heavy cartons. 
Each carton has a serial number and the cartons are all lined up in a row. 
Unfortunately, your teacher asked for the cartons to be placed in a particular sequence and you forgot to tell the people who unloaded the cartons about this. 
You now have to quickly restore the cartons to the correct order before the teacher comes and sees how you have messed up her instructions.

Since the cartons are very heavy, you cannot carry them over long distances. 
In each step, all you can do is to exchange the position of two adjacent cartons.

For instance, suppose the serial numbers on the cartons in the order in which they are 
unloaded are 34, 29, 12, 78 and 90 and the order in which the cartons were supposed to be arranged is 90, 29, 78, 34, 12. 
These cartons can be rearranged in the desired order with 7 exchanges, as follows:

 • Exchange 78, 90 — 34, 29, 12, 90, 78

 • Exchange 12, 90 — 34, 29, 90, 12, 78

 • Exchange 34, 29 — 29, 34, 90, 12, 78

 • Exchange 12, 78 — 29, 34, 90, 78, 12

 • Exchange 34, 90 — 29, 90, 34, 78, 12

 • Exchange 29, 90 — 90, 29, 34, 78, 12

 • Exchange 34, 78 — 90, 29, 78, 34, 12


In this example, it can be shown that 7 exchanges are needed to reorder the cartons as desired.
Clearly, you want to get the job done with minimum eﬀort. Given the initial arrangement of the cartons and the ﬁnal sequence that the teacher wants, your goal is to compute the minimum number of exchanges required to rearrange the cartons in the desired order.

## Input

- The ﬁrst line of input is a single integer N, the total number of cartons. 
- The second line consists of N distinct positive integers, separated by spaces, denoting the serial numbers of the N cartons in the order in 
which they were unloaded. 
- The third line is another sequence of N integers, denoting the desired order in which the N cartons should be rearranged. 
The sequence of numbers in the third line is guaranteed to be a permutation of the sequence in the second line.

## Output

The output should be a single integer, the minimum number of exchanges required to achieve the desired sequence of cartons.

## Constraints

- 1 ≤ N ≤ 10<sup>5</sup>

## Example

### Input:

5

34 29 12 78 90

90 29 78 34 12

### Output:

7

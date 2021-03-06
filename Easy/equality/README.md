# Equality

An equation is an equality containing one or more variables. 
Solving the equation consists of determining which values of the variables make the equality true. 
In this situation, variables are also known as unknowns and the values which satisfy the equality are known as solutions. 
An equation differs from an identity in that an equation is not necessarily true for all possible values of the variable.

There are many types of equations, and they are found in all areas of mathematics. 
For instance, a linear equation is an algebraic equation in which each term is either a constant or the product of a 
constant and (the first power of) a single variable.

In this problem we'll consider quite a special kind of systems of linear equations. 
To be more specific, you are given a system of N linear equations of the following form:

- **x<sub>2</sub> + x<sub>3</sub> + ... + x<sub>N</sub> - 1 + x<sub>N</sub> = a<sub>1</sub>**
- **x<sub>1</sub> + x<sub>3</sub> + ... + x<sub>N</sub> - 1 + x<sub>N</sub> = a<sub>2</sub>**
- **...**
- **x<sub>1</sub> + x<sub>2</sub> + ... + x<sub>N</sub> - 2 + x<sub>N</sub> = a<sub>N</sub> - 1**
- **x<sub>1</sub> + x<sub>2</sub> + ... + x<sub>N</sub> - 2 + x<sub>N</sub> - 1 = a<sub>N</sub>**

In other words, i'th equation of the system consists of the sum of all the variable x<sub>1</sub>, ..., x<sub>N</sub> except x<sub>i</sub> to the left of the 
equality sign and the constant ai to the right of the equality sign.

One can easily prove, that a system of linear equations as described above always have exactly one solution in case N is greater than one. 
Your task is to find the solution of the system(such a sequence x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>N</sub>, that turns each of the equations into equality). 
It's guaranteed, that the solution of the system is a sequence consisting only of integers from the range [1, 10<sup>8</sup>].

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of the test case description contains one integer N denoting the number of equations in the system.
- The second line contains N integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub> denoting the constants defining a system of linear equations, that you are asked to solve.

## Output

For each test case, output a single line containing N integers: a sequence x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>N</sub>, which is the solution of the system.

## Constraints

- 1 ≤ T ≤ 25000
- 2 ≤ N ≤ 50000
- 1 ≤ a<sub>i</sub> ≤ 5 × 10<sup>12</sup>
- 1 ≤ x<sub>i</sub> ≤ 10<sup>8</sup>
- The sum of all N in the input is not greater than 50000

## Example

### Input:

2

3

9 6 5

4

13 11 10 8

### Output:

1 4 5 

1 3 4 6 

## Explanation

### Case 1

We can simply replace the variables with the values from the correct output to make sure, that all the conditions are satisfied:

- x<sub>2</sub> + x<sub>3</sub> = 4 + 5 = 9 = a<sub>1</sub>
- x<sub>1</sub> + x<sub>3</sub> = 1 + 5 = 6 = a<sub>2</sub>
- x<sub>1</sub> + x<sub>2</sub> = 1 + 4 = 5 = a<sub>3</sub>

### Case 2

We can repeat the same process to make sure, that all the conditions are satisfied:

- x<sub>2</sub> + x<sub>3</sub> + x<sub>4</sub> = 3 + 4 + 6 = 13 = a<sub>1</sub>
- x<sub>1</sub> + x<sub>3</sub> + x<sub>4</sub> = 1 + 4 + 6 = 11 = a<sub>2</sub>
- x<sub>1</sub> + x<sub>2</sub> + x<sub>4</sub> = 1 + 3 + 6 = 10 = a<sub>3</sub>
- x<sub>1</sub> + x<sub>2</sub> + x<sub>3</sub> = 1 + 3 + 4 = 8 = a<sub>4</sub>

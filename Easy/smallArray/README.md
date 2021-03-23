# A Small Array

You are given a sequence of integers A<sub>1</sub>,A<sub>2</sub>,…,A<sub>N</sub> and a magical non-zero integer x

You have to select a subsegment of sequence A (possibly empty), and replace the elements in that subsegment after dividing them by x.

Formally, replace any one subsegment A<sub>l</sub>,A<sub>l+1</sub>,...,A<sub>r</sub> 
with A<sub>l</sub>/x,A<sub>l+1</sub>/x,...,A<sub>r</sub>/x where l≤r.

What is the minimum possible sum you can obtain?

Note: The given operation can only be performed once

## Input

- The first line of the input contains two positive integer n denoting the size of array, and x denoting the magical integer
- Next line contains N space separated integers

## Output

Single line containing one real number, denoting the minimum possible sum you can obtain. 
Your answer will be considered correct if its absolute or relative error does not exceed 10<sup>−2</sup>

## Constraints

- 1≤n≤10<sup>3</sup>
- 1≤|x|≤10<sup>3</sup>
- |A<sub>i</sub>|≤10<sup>3</sup>

## Example

### Input:

3 2

1 -2 3

### Output:

0.5

## Explanation

Array 1 -2 3, selecting subsegment {3}, you get 1 -2 1.5, which gives sum=0.5

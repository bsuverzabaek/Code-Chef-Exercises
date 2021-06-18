# Train Partner

Rahul and Rashi are off to the wedding of a close relative. This time they have to travel without their guardians. Rahul got very interested in the arrangement of seats inside the train coach.

The entire coach could be viewed as an arrangement of consecutive blocks of size 8.

<img width="244" alt="Screen Shot 2021-06-17 at 11 53 43 PM" src="https://user-images.githubusercontent.com/69542867/122513211-55cef480-cfc7-11eb-8a2c-407d2e2ccb9f.png">

Each of these size-8 blocks are further arranged as:

<img width="384" alt="Screen Shot 2021-06-17 at 11 53 51 PM" src="https://user-images.githubusercontent.com/69542867/122513214-55cef480-cfc7-11eb-8a1b-83c8bc97fdd1.png">

Here LB denotes lower berth, MB middle berth and UB upper berth.

The following berths are called Train-Partners:

<img width="115" alt="Screen Shot 2021-06-17 at 11 53 58 PM" src="https://user-images.githubusercontent.com/69542867/122513216-56678b00-cfc7-11eb-9b16-49a3b95310f7.png">

and the pattern is repeated for every set of 8 berths.

Rahul and Rashi are playing this game of finding the train partner of each berth. Can you write a program to do the same?

## Input

- The first line of input contains a single integer T, denoting the number of test cases to follow.
- Each of the next T lines contain a single integer N, the berth number whose neighbor is to be found out.

## Output

The output should contain exactly T lines each containing the berth of the neighbor of the corresponding seat.

## Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 500

## Example

### Input:

3

1

5

3

### Output:

4LB

2MB

6UB

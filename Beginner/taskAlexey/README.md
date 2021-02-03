# Task for Alexey

Alexey is trying to develop a program for a very simple microcontroller. 
It makes readings from various sensors over time, and these readings must happen at specific regular times. 
Unfortunately, if two of these readings occur at the same time, the microcontroller freezes and must be reset.

There are N different sensors that read data on a regular basis. 
For each i from 1 to N, the reading from sensor i will occur every A<sub>i</sub> milliseconds with the first reading 
occurring exactly A<sub>i</sub> milliseconds after the microcontroller is powered up. 
Each reading takes precisely one millisecond on Alexey's microcontroller.

Alexey wants to know when the microcontroller will freeze after he turns it on.

## Input

- The first line of the input contains an integer T denoting the number of test cases. 
The description of T test cases follows.
- The first line contains single integer N denoting the number of sensors.
- The second line contains N space-separated integers A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub> denoting frequency of measurements. 
Namely, sensor i will be read every A<sub>i</sub> milliseconds with the first reading occurring A<sub>i</sub> milliseconds after the microcontroller is first turned on.

## Output

For each test case, output a single line containing the number of milliseconds until the microcontroller freezes.

## Constraints

- 1 ≤ T ≤ 10
- 2 ≤ N ≤ 500
- 1 ≤ A<sub>i</sub> ≤ 10<sup>9</sup>

## Example

### Input:

3

3

2 3 5

4

1 8 7 11

4

4 4 5 6

### Output:

6

7

4

## Explanation

### Case 1

In 6 milliseconds, the third reading will be attempted from the 1st sensor and the second reading will be attempted from the 2nd sensor.

### Case 2

In 7 milliseconds the seventh reading will be attempted from the 1st sensor and the first reading will be attempted from the 3rd sensor.

### Case 3

In 4 milliseconds, the first readings from the first two sensors will be attempted.



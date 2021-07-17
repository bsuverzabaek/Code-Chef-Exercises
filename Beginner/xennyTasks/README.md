# Xenny and Alternating Tasks

Xenny and Yana were very keen to celebrate Valentine's Day at their home. 
To make preparations for the celebration, they listed down N tasks that they had to complete.

To complete the i<sup>th</sup> task, Xenny takes X<sub>i</sub> seconds and Yana takes Y<sub>i</sub> seconds. 
In order to minimize the disparity in tasks performed, they decide to do the tasks alternatingly. 
If Xenny did the 1<sup>st</sup> task, then Yana would just wait and watch him until he completes the task. 
After that, Yana would start the 2<sup>nd</sup> task, and while she does her task, Xenny would just watch her. 
He would start the 3<sup>rd</sup> task only after her completion, and they would keep doing tasks alternatingly uptil the N<sup>th</sup> task. 
They could also do tasks in the other order - that is, Yana could do the 1<sup>st</sup> task, after that Xenny could do the 2<sup>nd</sup> task, and so on. 
Their eventual goal was to minimize the total time taken by them to complete all N tasks.

Please help them find the minimum total time they would take to complete all N tasks.

## Input

- The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
- The first line of each testcase contains a positive integer N - the number of tasks to be completed.
- The second line contains N space-separated positive integers representing the time taken in seconds by Xenny to complete the i<sup>th</sup> task.
- The third line contains N space-separated positive integers representing the time taken in seconds by Yana to complete the i<sup>th</sup> task.

## Output

For each testcase, print a single line containing the minimum total time in seconds Xenny and Yana would take to complete the tasks.

## Constraints

- 1 ≤ T ≤ 10
- 1 ≤ N ≤ 2*10<sup>4</sup>
- 1 ≤ X<sub>i</sub>, Y<sub>i</sub> ≤ 10<sup>5</sup>

## Example

### Input:

1

3

2 1 2

3 2 1

### Output:

5

## Explanation

Let's say Xenny does the 1<sup>st</sup> task. Then Yana would do the 2<sup>nd</sup> task and Xenny would do the 3<sup>rd</sup> task. 
Hence, the total time taken would be: 2 + 2 + 2 = 6 seconds.

Another possibility is that Yana does the 1st task, Xenny does the 2<sup>nd</sup> task and then Yana does the 3<sup>rd</sup> task. 
The total time taken in this case would be 5 seconds.

Hence, the minimum total time taken would be 5 seconds.

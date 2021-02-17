# Superpowers of 2

Cyael is a very gifted girl who loves Magic (she even reached the finals on a very famous tournament in Byteland ;) ) and Computer Science. 
As we know, CS is a very vast subject and Cyael learns what she can, little by little, by reading the editorials of codechef.com, her favourite programming website.

Today, she came across a problem that was about calculating powers of two, and she got 
bored of it really fast, as she considers she knows all there is to know about powers of two. 
She knows how to compute even very big powers, like powers of 10, so it's obvious that for her, powers of two have no secrets :D

But her friend Lira, as she was tired of hearing her boasting about her skills for calculating powers, decided to 
challenge her with a brand new task: computing what she calls, SuperPowers of 2 .

Cyael: "Okay Lira, tell me about SuperPower of 2 so that I can solve one more problem and prepare for Codechef's November Long Challenge!! 
It's less than a month away!"

Lira: "I define the N<sup>th</sup> Superpower of 2 as being the number (2<sup>N_bin</sup>)<sup>2</sup> , where N_bin stands for the decimal 
number encoded by the representation in base 2 of the number N.

So, for example, the 2<sup>nd</sup> SuperPower of 2 is then equal to the number:

(2<sup>10</sup>)<sup>2</sup> = 1048576

because, N = 2 , and its binary encoding is 10 in decimal it is ten. So 2<sup>10</sup> = 1024 and 1024<sup>2</sup> = 1048576

Since the answer can be large, you are asked to compute SuperPowers of 2 modulo 1000000007."

## Input

- The first line of the input contains an integer T denoting the number of test cases.
- Then on the following T lines, there is an integer N, denoting the index of the SuperPower of 2 you need to compute modulo 1000000007.

## Output

For each test case, output a single line containing the required value: the N<sup>th</sup> SuperPower of 2 modulo 1000000007.

## Constraints

1 ≤ N ≤ 600000
T = 100000 on each official test-case file.

## Example

### Input:

100000

1

2

(and 99998 more test cases...)

### Output:

4

1048576

(and 99998 more answers...)

# Tax Slabs

In India, every individual is charged with income tax on the total income each year. 
This tax is applied to specific ranges of income, which are called income tax slabs. 
The slabs of income tax keep changing from year to year. This fiscal year (2020-21), the tax slabs and their respective tax rates are as follows:

<img width="556" alt="Screen Shot 2021-02-03 at 4 59 10 PM" src="https://user-images.githubusercontent.com/69542867/106824969-2d121800-6641-11eb-88c0-97cc34627a42.png">

See the sample explanation for details on how the income tax is calculated.

You are given Chef's total income: N rupees (Rs.). Find his net income. 
The net income is calculated by subtracting the total tax (also called tax reduction) from the total income. 
Note that you do not need to worry about any other kind of tax reductions, only the one described above.

## Input

- The first line of the input contains a single integer T denoting the number of test cases. 
The description of T test cases follows.
- The first and only line of each test case contains a single integer N.

## Output

For each test case, print a single line containing one integer — Chef's net income.

## Constraints

- 1≤T≤10<sup>3</sup>
- 0≤N≤10<sup>7</sup>
- N is a multiple of 100

## Example

### Input:

2

600000

250000

### Output:

577500

250000

## Explanation

### Case 1

We know that the total income is Rs. 6 lakh (1 lakh rupees = 10<sup>5</sup> rupees). 
The total tax for each slab is calculated as follows:

- Up to 2.5 lakh, the tax is Rs. 0, since the tax rate is 0 percent.
- From above Rs. 2.5 lakh to Rs. 5 lakh, the tax rate is 5 percent. Therefore, this tax is 0.05⋅(500,000−250,000), which is Rs. 12,500.
- From above Rs. 5 lakh to Rs. 6 lakh, the tax rate is 10 percent. Therefore, this tax is 0.10⋅(600,000−500,000), which is Rs. 10,000.
- Summing them up, we get that the total tax on Chef's whole income is Rs. 22,500. Since the net income is the total income 
minus the tax reduction, it is Rs. 600,000 minus Rs. 22,500, which is Rs. 577,500.

### Case 2

For income up to Rs. 2.5 lakh, we have no tax, so the net income is the same as the total income: Rs. 2.5 lakh.


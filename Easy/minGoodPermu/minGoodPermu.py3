def print_func(n):
	for i in range(1,n+1,2):
		print(str(i+1) + " " + str(i) + " ",end='')

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	n = int(input())
	assert(n>=2 and n<=100000), "n must be 2 <= n <= 10^5"

	if (n%2==0):
		print_func(n)
	else:
		n -= 3
		print_func(n)
		print(str(n+2) + " " + str(n+3) + " " + str(n+1),end='')

	print("")

	T -= 1
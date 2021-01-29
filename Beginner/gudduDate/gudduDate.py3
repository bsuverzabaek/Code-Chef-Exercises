T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000000000000000), "N must be 1 <= N <= 10^18"

	a = 0
	n = N

	while (n!=0):
		a = a+n%10
		n = int(n/10)

	for i in range(0,10):
		if ((a+i)%10==0):
			print(str(N)+str(i))
			break

	T -= 1
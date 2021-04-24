def solve(n):
	if (n==2 or n==17):
		return 1
	elif (n==16 or n==34 or n==289):
		return 0
	else:
		i = 2

		while (i*i<=n):
			if (n%i==0):
				return 1

			i += 1

		return 0

T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000000), "N must be 2 <= N <= 10^8"

	if (solve(N)!=0):
		print("Mike")
	else:
		print("Tom")

	T -= 1
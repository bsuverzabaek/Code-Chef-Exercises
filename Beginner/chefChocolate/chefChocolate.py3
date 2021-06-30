T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	n,m = map(int,input().split())

	assert(n>=1 and n<=1000000000), "n must be 1 <= n <= 10^9"
	assert(m>=1 and m<=1000000000), "m must be 1 <= m <= 10^9"

	if ((n*m)%2==0):
		print("Yes")
	else:
		print("No")

	T -= 1
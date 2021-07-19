N,Q = map(int,input().split())

assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
assert(Q>=1 and Q<=100000), "Q must be 1 <= Q <= 10^5"

A = (list(map(int,input().split())))[:N]

b = min(A)
c = max(A)

while (Q>0):
	t = int(input())
	assert(t>=0 and t<=1000000000), "t must be 0 <= t <= 10^9"

	if (t>=b and t<=c):
		print("Yes")
	else:
		print("No")

	Q -= 1
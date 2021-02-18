N,Q = map(int,input().split())

assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
assert(Q>=1 and Q<=100000), "Q must be 1 <= Q <= 10^5"

f = [int(i) for i in input().split()]
a = 0
s = [0]

for i in f:
	assert(i>=0 and i<=1000000000), "All f[i] must be 0 <= f[i] <= 10^9"
	a ^= i
	s.append(a)

while (Q>0):
	k = int(input())
	assert(k>=1 and k<=1000000000), "k must be 1 <= k <= 10^9"

	print(s[k%(N+1)])

	Q -= 1
def gcd(C,D):
	if (D==0):
		return C

	return gcd(D,C%D)

T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10^4"

while (T>0):
	A,B,C,D = map(int,input().split())

	assert(A>=1 and A<=100000000000000), "A must be 1 <= A <= 10^14"
	assert(B>=1 and B<=100000000000000), "B must be 1 <= B <= 10^14"
	assert(C>=1 and C<=100000000000000), "C must be 1 <= C <= 10^14"
	assert(D>=1 and D<=100000000000000), "D must be 1 <= D <= 10^14"

	g = gcd(C,D)
	diff = abs(A-B)
	diff %= g

	if (g-diff<diff):
		diff = g-diff

	print(diff)

	T -= 1
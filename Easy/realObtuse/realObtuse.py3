T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	k,A,B = map(int,input().split())

	assert(k>=3 and k<=1000000000), "k must be 3 <= k <= 10^9"
	assert(A>=1 and A<=k and B>=1 and B<=k), "A and B must be 1 <= A,B <= k"
	assert(A!=B), "A and B must not be equal"

	if (abs(A-B)==k-abs(A-B)):
		print(0)
	else:
		print(min(abs(A-B),k-abs(A-B))-1)

	T -= 1
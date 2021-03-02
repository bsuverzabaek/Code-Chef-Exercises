T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 10^3"

sumN = 0
sumQ = 0

while (T>0):
	N,Q = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(Q>=1 and Q<=100000), "N must be 1 <= Q <= 10^5"

	sumN += N
	sumQ += Q

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <=10^6"
		assert(sumQ<=1000000), "Sum of Q must be <=10^6"

	des = [0]*(N+1)
	ps = []

	for i in range(0,Q):
		l,r = map(int,input().split())

		assert(l>=1 and l<=r), "l and r must be 1 <= l <= r <= N"
		assert(r>=l and r<=N), "l and r must be 1 <= l <= r <= N"

		ps.append((l-1,r))
		des[l-1] += 1
		des[r] -= 1

	for i in range(1,len(des)):
		des[i] += des[i-1]

	for l,r in ps:
		des[r] -= r-l

	for i in range(1,len(des)):
		des[i] += des[i-1]

	des.pop(-1)
	print(*des)

	T -= 1
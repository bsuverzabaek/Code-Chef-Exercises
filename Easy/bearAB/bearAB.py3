T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(N*K>=1 and N*K<=1000000000), "N*k must be 1 <= N*K <= 10^9"

	S = input()

	countA = 0;
	countB = 0;
	ans = 0;

	for i in range(0,N):
		if(S[i]=='a'):
			countA += 1

		if(S[i]=='b'):
			countB += 1
			ans += countA

	ans *= K
	ans += countA*countB*K*(K-1)//2
	print(ans)

	T -= 1
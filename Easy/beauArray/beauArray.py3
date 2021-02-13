T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	sumN += N

	if (T==1):
		assert(sumN>=1 and sumN<=1000000), "Sum on N must be 1 <= sumN <= 10^6"

	A = [0]*4
	X = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(X[i]>=0 and X[i]<=1000000000), "All A[i] must be 0 <= A[i] <= 10^9"
		A[X[i]%4] += 1

	if((A[1]+2*A[2]+3*A[3])%4==0):
		ans = min(A[1],A[3])

		A[1] -= ans
		A[3] -= ans
		
		ans += A[2]//2
		A[2] %= 2

		if(A[2]!=0):
			ans += 2
			A[2] = 0

			if(A[3]!=0):
				A[3] -= 2
			

			if(A[1]!=0):
				A[1] -= 2
			
		if(A[1]!=0):
			ans += (A[1]/4)*3
		
		if(A[3]!=0):
			ans += (A[3]/4)*3
		
		print(ans)
	else:
		print(-1)

	T -= 1
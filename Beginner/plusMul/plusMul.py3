T = int(input())
assert(T>=1 and T<=20), "T must be 1 <= T <= 20"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=40000), "N must be 1 <= N <= 40000"

	A = (list(map(int,input().split())))[:N]
	a = 0
	b = 0

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^9"

		if (A[i]==0):
			b += 1
				
		if (A[i]==2):
			a += 1
	
	print(int(((b-1)*b/2+(a-1)*a)/2))	

	T -= 1
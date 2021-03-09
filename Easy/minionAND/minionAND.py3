T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"

	Q = int(input())
	assert(Q>=1 and Q<=100000), "Q must be 1 <= Q <= 10^5"

	while (Q>0):
		L,R = map(int,input().split())
		flag = 0
				
		L -= 1
		R -= 1

		for i in range(L,R+1):
			if (A[i]%2==0):
				flag = 1
				break

		if (flag==1):
			print("EVEN")
		else:
			print("ODD")

		Q -= 1

	T -= 1
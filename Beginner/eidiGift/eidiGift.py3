T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	X = list(map(int,input().split()))
	A = X[:3]
	C = X[3:]

	for i in range(0,3):
		assert(A[i]>=1 and A[i]<=17), "A["+str(i)+"] must be 1 <= A[i] <= 17"
		assert(C[i]>=1 and C[i]<=100), "C["+str(i)+"] must be 1 <= C[i] <= 100"

	flag = 1

	for i in range(0,3):
		for j in range(0,3):
			if (i!=j):
				if (A[i]<A[j]):
					if (C[i]>=C[j]):
						flag = 0
						break
				elif (A[i]==A[j]):
					if (C[i]!=C[j]):
						flag = 0
						break
				else:
					if (C[i]<=C[j]):
						flag = 0
						break

	if (flag==1):
		print("FAIR")
	else:
		print("NOT FAIR")

	T -= 1
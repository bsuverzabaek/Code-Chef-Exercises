T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	N,Z1,Z2 = map(int,input().split())

	assert(N>=1 and N<=50), "N must be 1 <= N <= 50"
	assert(abs(Z1)<=1000000000), "Abs of Z1 must be abs(Z1)<=10^9"
	assert(abs(Z2)<=1000000000), "Abs of Z2 must be abs(Z2)<=10^9"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(abs(A[i])<=1000000000), "Abs of each element must be abs(A[i])<=10^9"

	t1 = [i for i in A] + [-i for i in A]

	if (Z1 in t1 or Z2 in t1):
		print(1)
	else:
		t2 = 2

		for i in t1:
			t3 = [i + j for j in t1]

			if (Z1 not in t3 and Z2 not in t3):
				t2 = 0
				break

		print(t2)

	T -= 1
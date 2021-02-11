T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000 and N%2!=0), "N must be 1 <= N <= 10^5 and odd"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:N]
	C = []
	count = [0]*100000

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^6"
		assert(B[i]>=0 and B[i]<=1000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^6"
		count[B[i]] += 1

	xor = 0

	for i in range(0,N):
		xor ^= A[i] ^ B[i]

	flag = 0

	for i in range(0,N):
		if (count[xor^A[i]]>0):
			count[xor^A[i]] -= 1
			C.append(xor^A[i])
		else:
			flag = 1
			break

	if (flag==0):
		for i in range(0,N):
			print(str(C[i]) + " ",end='')
		print()
	else:
		print(-1)

	T -= 1
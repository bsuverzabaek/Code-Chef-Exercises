T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N msut be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	d = [0]*1000010

	even = 0
	odd = 0

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000), "Each element must be 1 <= x <= 10^6"

		if (A[i]%2!=0):
			odd += 1
		else:
			even += 1

		d[A[i]] += 1

	ans = 0

	for i in range(0,N):
		if (A[i]%2!=0):
			ans += odd
		else:
			ans += even

		ans -= d[A[i]]
		ans -= d[2^A[i]]

	print(ans//2)

	T -= 1
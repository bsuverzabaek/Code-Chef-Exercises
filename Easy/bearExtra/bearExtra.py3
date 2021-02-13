def totalSum(min,max):
	return ((max*(max+1))//2) - ((min*(min-1))//2)

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=3 and N<=100000), "N must be 3 <= N <= 10^5"

	sum = 0;
	min = 1000000001;
	nextMin = 1000000001;
	max = 0;
	nextMax = 0;

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "All A[i] must be 1 <= A[i] <= 10^9"

		sum += A[i]

		if (min>A[i]):
			nextMin = min
			min = A[i]
		elif (nextMin>A[i]):
			nextMin = A[i]
		

		if (max<A[i]):
			nextMax = max
			max = A[i]
		elif (nextMax<A[i]):
			nextMax = A[i]

	if ((sum-totalSum(nextMin,max))==min):
		print(min)
	elif ((sum-totalSum(min,nextMax))==max):
		print(max)
	else:
		print(sum-totalSum(min,max))

	T -= 1
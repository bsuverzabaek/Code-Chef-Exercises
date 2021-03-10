T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 10^3"

	arr = [1]*N
	height = (list(map(int,input().split())))[:N]
	iq = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(height[i]>=1 and height[i]<=1000000000), "height["+str(i)+"] must be 1 <= height[i] <= 10^9"
		assert(iq[i]>=1 and iq[i]<=1000000000), "iq["+str(i)+"] must be 1 <= iq[i] <= 10^9"

	for i in range(N):
		for j in range(i):
			if (height[i]>height[j] and iq[i]<iq[j]):
				arr[i] = max(arr[i],arr[j]+1)

	print(max(arr))

	T -= 1
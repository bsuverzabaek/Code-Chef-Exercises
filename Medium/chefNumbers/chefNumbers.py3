N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

ans = 0

a = (list(map(int,input().split())))[:N]

for i in range(0,N):
	low = 0
	high = ans-1

	assert(a[i]>=1 and a[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 100000"

	while (low<=high):
		m = (low+high)//2

		if (a[m]<=a[i]):
			high = m-1
		else:
			low = m+1

	ans = max(ans,low+1)

print(ans)
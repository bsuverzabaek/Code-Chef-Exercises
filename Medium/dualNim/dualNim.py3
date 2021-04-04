T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=500), "N must be 1 <= N <= 500"

	x = 0
	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=500), "a["+str(i)+"] must be 1 <= a[i] <= 500"
		x ^= a[i]

	if (x==0 or N%2==0):
		print("First")
	else:
		print("Second")

	T -= 1
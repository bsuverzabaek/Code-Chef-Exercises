T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	n,k = map(int,input().split())

	assert(n>=1 and n<=50), "n must be 1 <= n <= 50"
	assert(k>=0 and k<=n), "k must be 0 <= k <= n"

	a = (list(map(int,input().split())))[:n]
	even = 0

	for i in range(0,n):
		assert(a[i]>=1 and a[i]<=100), "a["+str(i)+"] must be 1 <= a[i] <= 100"

		if (a[i]%2==0):
			even += 1

	if (even==n and k==0):
		print("NO")
	elif (even>=k):
		print("YES")
	else:
		print("NO")

	T -= 1
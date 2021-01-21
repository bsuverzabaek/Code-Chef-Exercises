T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10^4"

while (T>0):

	n = int(input())
	assert(n>=1 and n<=50), "n must be 1 <= n <= 50"

	d = (list(map(int,input().split())))[:n]

	for i in range(0,n):
		assert(d[i]>=1 and d[i]<=100), "d must be 1 <= d <= 100"

	count = []

	for i in d:
		if (i not in count):
			count.append(i)

	print(len(count))

	T -= 1
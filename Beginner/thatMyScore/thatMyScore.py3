T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

	arr = [0]*8

	while (N>0):
		p,s = map(int,input().split())

		assert(p>=1 and p<=11), "p must be 1 <= p <= 11"
		assert(s>=0 and s<=100), "s must be 0 <= s <= 100"

		if (p<=8):
			if (arr[p-1]==0 or arr[p-1]<s):
				arr[p-1] = s

		N -= 1

	sum = 0

	for i in range(0,8):
		sum += arr[i]

	print(sum)

	T -= 1
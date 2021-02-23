T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"
	K = int(input())

	count1 = K%N
	count2 = N-count1

	if (count1<count2):
		print(2*count1)
	elif (count1>count2):
		print(2*count2)
	else:
		print(2*count1-1)

	T -= 1
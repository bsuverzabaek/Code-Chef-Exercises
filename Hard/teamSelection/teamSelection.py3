T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	ans = 0
	curSum = 0
	ele = []

	for i in range(0,N):
		ei = int(input())
		assert(ei>=1 and ei<=450), "Each skill point must be 1 <= s <= 450"

		ele.insert(i,ei)
		curSum += ele[i]

		if ((i&1)!=0):
			ans += ele[i]

	sum = [0]*(curSum+1)
	sum[0] = 1
	curSum = 0

	for i in range(0,N):
		for j in range(curSum+ele[i],ele[i]-1,-1):
			sum[j] |= (sum[j-ele[i]]<<1)

		curSum += ele[i]
	
	bestDiff = abs(curSum-2*ans)

	for i in range(0,curSum+1):
		if ((sum[i]&(1<<(N//2)))!=0 or (sum[i]&(1<<(N-N//2)))!=0):
			if (bestDiff>abs(curSum-2*i)):
				ans = i
				bestDiff = abs(curSum-2*i)

	if (ans>curSum-ans):
		ans = curSum-ans

	print(str(ans) + " " + str(curSum-ans))

	T -= 1
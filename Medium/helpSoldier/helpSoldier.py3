N,T = map(int,input().split())

assert(N>6 and N<101), "N must be 6 < N < 101"
assert(T>0 and T<1001), "T must be 0 < T < 1001"

cost = [0]*7
qual = [0]*7

for i in range(0,N):
	type,value,quality = map(int,input().split())

	assert(type>=1 and type<=6), "Type must be 1 <= type <= 6"
	assert(value>0), "Price must be >0"

	if (qual[type]<quality and T+cost[type]>value):
		qual[type] = quality
		cost[type] = value
		T = T+cost[type]-value

if (qual[1]==0):
	print(0)
else:
	min = qual[1]

	for i in range(2,7):
		if (min>qual[i]):
			min = qual[i]

	print(min)		
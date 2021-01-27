T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	tr = int(input())
	assert(tr>=1 and tr<=100), "tr must be 1 <= tr <= 100"

	Tr = (list(map(int,input().split())))[:tr]

	for i in range(0,tr):
		assert(Tr[i]>=1 and Tr[i]<=100), "Tr["+str(i)+"] must be 1 <= Tr[i] <= 100"

	dr = int(input())
	assert(dr>=1 and dr<=100), "dr must be 1 <= dr <= 100"

	Dr = (list(map(int,input().split())))[:dr]

	for i in range(0,dr):
		assert(Dr[i]>=1 and Dr[i]<=100), "Dr["+str(i)+"] must be 1 <= Dr[i] <= 100"

	ts = int(input())
	assert(ts>=1 and ts<=100), "ts must be 1 <= ts <= 100"

	Ts = (list(map(int,input().split())))[:ts]

	for i in range(0,ts):
		assert(Ts[i]>=1 and Ts[i]<=100), "Ts["+str(i)+"] must be 1 <= Ts[i] <= 100"

	ds = int(input())
	assert(ds>=1 and ds<=100), "ds must be 1 <= ds <= 100"

	Ds = (list(map(int,input().split())))[:ds]

	for i in range(0,ds):
		assert(Ds[i]>=1 and Ds[i]<=100), "Ds["+str(i)+"] must be 1 <= Ds[i] <= 100"

	for i in range(0,ts):
		flag1 = 0
		for j in range(0,tr):
			if (Ts[i]==Tr[j]):
				flag1 = 1
		if (flag1==0):
			break

	for i in range(0,ds):
		flag2 = 0
		for j in range(0,dr):
			if (Ds[i]==Dr[j]):
				flag2 = 1
		if (flag2==0):
			break

	if (flag1==0 or flag2==0):
		print("no")
	else:
		print("yes")

	T -= 1
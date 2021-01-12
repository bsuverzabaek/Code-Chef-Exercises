while (1):
	t = int(input())

	if (t<=0 or t>1000000):
		print("t must be 1 <= t <= 10^6")
	else:
		break

N = []

for i in range(0,t):
	while (1):
		ni = int(input())

		if (ni<0 or ni>1000000):
			print("N["+str(i)+"] must be 0 <= N[i] <= 10^6")
		else:
			N.insert(i,ni)
			break

N.sort()
print("")

for i in range(0,t):
	print(N[i])	
T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	count = 0

	for i in range(0,10):
		times = (list(map(int,input().split())))[:10]
		for j in times:
			assert(j>=1 and j<=60), "Time must be 1 <= time <= 60"
			if (j<=30):
				count += 1

	if (count>=60):
		print("yes")
	else:
		print("no")

	T -= 1
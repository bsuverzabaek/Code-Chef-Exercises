T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 10^3"

while (T>0):
	w,S = input().split()

	W = int(w)
	assert(W>=28 and W<=31), "W must be 28 <= W <= 31"

	a = [4,4,4,4,4,4,4]
	i = 0

	if (S=="mon"):
		i = 0
	elif (S=="tues"):
		i = 1
	elif (S=="wed"):
		i = 2
	elif (S=="thurs"):
		i = 3
	elif (S=="fri"):
		i = 4
	elif (S=="sat"):
		i = 5
	elif (S=="sun"):
		i = 6

	for j in range(29,W+1):
		a[i] += 1
		i += 1

		if (i==7):
			i = 0

	print(*a)

	T -= 1
T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	N = int(input())
	assert(N>=3 and N<=2500), "N must be 3 <= N <= 2500"

	ans = 0

	for i in range(N-1,0,-1):
		d = 0
		pro = i*(N-i)-1
		count = 0

		j = 1

		while (j*j<=pro):
			count += 1
			d = d+(pro//j)-j
			j += 1

		ans = ans+(d*2)+count

	print(ans)

	T -= 1
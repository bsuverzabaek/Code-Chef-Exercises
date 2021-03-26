T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	D,H = map(int,input().split())

	assert(D>=0 and D<=100000), "D must be 0 <= D <= 10^5"
	assert(H>=0 and H<=100000), "H must be 0 <= H <= 10^5"

	if (D>H):
		temp = D
		D = H
		H = temp

	if (D==0 and H!=0):
		print(-1)
	elif (D==0 and H==0):
		print(0)
	elif (D==H):
		print(D)
	else:
		ans = 0

		while (D<H-D):
			D *= 2
			ans += 1

		ans += H
		ans += 1

		print(ans)

	T -= 1
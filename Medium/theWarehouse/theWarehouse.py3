T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100000), "Length of String S must be 1 <= |S| <= 10^5"

	n = len(S)

	for i in range(0,n):
		assert(S[i]=='r' or S[i]=='g' or S[i]=='b'), "String S must have only r,g,b"

	ans = [0]*6
	a = [[0]*3]*6

	for i in range(0,n):
		if (S[i]=='r'):
			ans[0] += a[0][1]+a[0][2]
			ans[1] += a[1][1]+a[1][2]
			ans[2] += 0
			ans[3] += 0
			ans[4] += a[4][2]
			ans[5] += a[5][1]

			a[0][0] += 1
			a[1][0] += 1
			a[2][0] += 1
			a[3][0] += 1
			a[4][0] += 1
			a[5][0] += 1
		elif (S[i]=='b'):
			ans[0] += a[0][2]
			ans[1] += 0
			ans[2] += a[2][0]+a[2][2]
			ans[3] += a[3][0]
			ans[4] += a[4][0]+a[4][2]
			ans[5] += 0

			a[0][1] += 1
			a[1][1] += 1
			a[2][1] += 1
			a[3][1] += 1
			a[4][1] += 1
			a[5][1] += 1
		else:
			ans[0] += 0
			ans[1] += a[1][1]
			ans[2] += a[2][0]
			ans[3] += a[3][0]+a[3][1]
			ans[4] += 0
			ans[5] += a[5][0]+a[5][1]

			a[0][2] += 1
			a[1][2] += 1
			a[2][2] += 1
			a[3][2] += 1
			a[4][2] += 1
			a[5][2] += 1

	min = ans[0]

	for i in range(1,6):
		if (min>ans[i]):
			min = ans[i]

	print(min//6)

	T -= 1
T = int(input())

while (T>0):
	a = (list(map(int,input().split())))[:3]

	for i in range(0,3):
		assert(a[i]>=1 and a[i]<=1000), "Each value must be 1 <= a <= 1000"

	a.sort()

	if (a[0]+a[1]==a[2]):
		print("YES")
	else:
		print("NO")

	T -= 1
a = []
val = []
mark = [0]*1000

a.insert(0,0)

for i in range(0,6):
	val.insert(i,i+1)

	for j in range(0,i):
		val[i] *= (i+1)

for i in range(1,105001):
	for j in range(0,6):
		if (i>=val[j]): 
			mark[a[i-val[j]]] = 1

	for j in range(0,7):
		if (mark[j]==0): 
			a.insert(i,j)
			break

	for j in range(0,7):
		mark[j] = 0

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	ans = 0
	p = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(p[i]>=1 and p[i]<=100000), "a["+str(i)+"] must be 1 <= a[i] <= 100000"
		ans ^= a[p[i]]

	if (ans!=0):
		print("Little Chef")
	else:
		print("Head Chef")

	T -= 1
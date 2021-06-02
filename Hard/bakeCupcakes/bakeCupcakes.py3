def cover(st,k,use,fe,se,m):
	if (st==m):
		return 1

	if (use[fe[st]]!=0 or use[se[st]]!=0):
		return cover(st+1,k,use,fe,se,m)

	if (k==0):
		return 0

	use[fe[st]] = 1

	if (cover(st+1,k-1,use,fe,se,m)!=0):
		return 1

	use[fe[st]] = 0
	use[se[st]] = 1

	if (cover(st+1,k-1,use,fe,se,m)!=0):
		return 1

	use[se[st]] = 0
	return 0

T = int(input())
assert(T>=1 and T<=30), "T must be 1 <= T <= 30"

while (T>0):
	n,m,g = map(int,input().split())

	assert(n>=1 and n<=1000), "n must be 1 <= n <= 1000"
	assert(m>=1 and m<=20000), "m must be 1 <= m <= 20000"
	assert(g>=0 and g<=n), "g must be 0 <= g <= n"
	assert(n-g<=15), "n-g must be <= 15"

	fe = []
	se = []
	use = [0]*1000

	for i in range(0,m):
		fei,sei = map(int,input().split())

		assert(fei>=0 and fei<=n-1), "i must be 0 <= i <= n-1"
		assert(sei>=0 and sei<=n-1), "j must be 0 <= j <= n-1"

		fe.insert(i,fei)
		se.insert(i,sei)

	if (cover(0,n-g,use,fe,se,m)!=0):
		print("Possible")
	else:
		print("Impossible")

	T -= 1
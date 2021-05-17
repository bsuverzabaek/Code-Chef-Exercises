def LCA(u,v,a,b):
	while (u!=v):
		if (u>v):
			u >>= 1
			a <<= 1
		elif (v>u):
			v >>= 1
			b <<= 1

	return u

Q = int(input())
assert(Q>=1 and Q<=20000), "Q must be 1 <= Q <= 2*10^4"

while (Q>0):
	n,u,v = map(int,input().split())

	assert(u>=1 and u<=n), "u must be 1 <= u <= n"
	assert(v>=1 and v<=n), "v must be 1 <= v <= n"
	assert(n<=1000000000), "n must be <= 10^9"

	a = 1
	b = 1

	if (u>v):
		ans = u
		u = v
		v = ans

	ans = LCA(u,v,a,b)

	if (b>a):
		a = b

	print(ans+(n-v)//a)

	Q -= 1
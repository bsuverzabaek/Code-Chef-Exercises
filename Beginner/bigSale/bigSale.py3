T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	sum = 0.0

	while (N>0):
		p,q,d = map(int,input().split())

		assert(p>=1 and p<=100), "price must be 1 <= price <= 100"
		assert(q>=1 and q<=100), "quantity must be 1 <= quantity <= 100"
		assert(d>=0 and d<=100), "discount must be 1 <= discount <= 100"

		price = p+float(p*d)/100
		dPrice = price-float(price*d)/100
		sum += float(q)*(p-dPrice)

		N -= 1

	print("%.6f" % sum)

	T -= 1
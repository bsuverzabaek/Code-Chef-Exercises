T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	a,b = map(int,input().split())

	assert(a>=1 and a<=1000000000), "a must be 1 <= a <= 10^9"
	assert(b>=1 and b<=1000000000), "b must be 1 <= b <= 10^9"

	p = 1
	ans = 0

	while (a!=0 and b!=0):
		ans += (p*((a+b)%10))
		a //= 10
		b //= 10
		p *= 10
	
	if (a!=0):
		ans += (p*a)
	
	if (b!=0):
		ans += (p*b)
	
	print(ans)

	T -= 1
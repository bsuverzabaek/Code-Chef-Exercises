def diff(a,b):
	if (a>b):
		return a-b
	else:
		return b-a

Q = int(input())
assert(Q>=1 and Q<=1000), "Q must be 1 <= Q <= 1000"

while (Q>0):
	a,b = map(int,input().split())

	assert(a>=1 and a<=1000000000), "a must be 1 <= a <= 10^9"
	assert(b>=1 and b<=1000000000), "b must be 1 <= b <= 10^9"
	assert(a!=b), "a must not equal b"

	if (a<b):
		s = a
	else:
		s = b

	if (a>b):
		g = a
	else:
		g = b

	if (s%2==0 and g%2==0 and diff(a,b)==2):
		print("YES")
	elif (s%2==1 and g%2==1 and diff(a,b)==2):
		print("YES")
	elif (s%2==1 and g%2==0 and diff(a,b)==1):
		print("YES")
	else:
		print("NO")

	Q -= 1
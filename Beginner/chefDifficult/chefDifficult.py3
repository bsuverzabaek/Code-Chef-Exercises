T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	a,b = map(int,input().split())

	assert(a>=1 and a<=1000000000), "a must be 1 <= a <= 10^9"
	assert(b>=1 and b<=1000000000), "b must be 1 <= b <= 10^9"

	if (a==b or a<b or a>b):
		print("YES")

	T -= 1
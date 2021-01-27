T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	a,b,c,x,y = map(int,input().split())

	assert(a>=1 and a<=10000000), "a must be 1 <= a <= 10^9"
	assert(b>=1 and b<=10000000), "b must be 1 <= b <= 10^9"
	assert(c>=1 and c<=10000000), "c must be 1 <= c <= 10^9"
	assert(x>=1 and x<=10000000), "x must be 1 <= x <= 10^9"
	assert(y>=1 and y<=10000000), "y must be 1 <= y <= 10^9"

	if (x>y):
		temp = x
		x = y
		y = temp

	d = [a,b,c]
	d.sort()

	if (d[0]+d[1]+d[2]!=x+y or d[0]>x or d[1]>y):
		print("NO")
	else:
		print("YES")

	T -= 1
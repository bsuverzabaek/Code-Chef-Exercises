T = int(input())
assert(T>=1 and T<=300), "T must be 1 <= T <= 300"

while (T>0):
	x,y,xr,yr,D = map(int,input().split())

	assert(x>=1 and x<=100), "x must be 1 <= x <= 100"
	assert(y>=1 and y<=100), "y must be 1 <= y <= 100"
	assert(xr>=1 and xr<=10), "xr must be 1 <= xr <= 10"
	assert(yr>=1 and yr<=10), "yr must be 1 <= yr <= 10"
	assert(D>=1 and D<=10), "D must be 1 <= D <= 10"

	a = x/xr
	b = y/yr

	if (a>=D and b>=D):
		print("YES")
	else:
		print("NO")

	T -= 1
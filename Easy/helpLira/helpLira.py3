N = int(input())
assert(N>=2 and N<=100), "N must be 2 <= N <= 100"

min = 10000
max = -1

for i in range(0,N):
	x1,y1,x2,y2,x3,y3 = map(int,input().split())

	assert(x1>=-1000 and x1<=1000 and x2>=-1000 and x2<=1000 and x3>=-1000 and x3<=1000), "x's must be -1000 <= x <= 1000"
	assert(y1>=-1000 and y1<=1000 and y2>=-1000 and y2<=1000 and y3>=-1000 and y3<=1000), "y's must be -1000 <= y <= 1000"

	ans = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
	ans = int(abs(ans)/2)

	if (ans>=max):
		max = ans
		max_index = i
			

	if (ans<=min):
		min = ans
		min_index = i

print(str(min_index+1) + " " + str(max_index+1))			
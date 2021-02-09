T = int(input())
assert(T>=1 and T<=2013), "T must be 1 <= T <= 2013"

while (T>0):
	DS,DT,D = map(int,input().split())

	assert(DS>=1 and DS<=2013), "DS must be 1 <= DS <= 2013"
	assert(DT>=1 and DT<=2013), "DT must be 1 <= DT <= 2013"
	assert(D>=1 and D<=2013), "D must be 1 <= D <= 2013"

	print(max(0,D-DS-DT,DS-DT-D,DT-DS-D))

	T -= 1
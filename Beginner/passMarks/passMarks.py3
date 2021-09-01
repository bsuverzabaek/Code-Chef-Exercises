T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	aMin,bMin,cMin,tMin,A,B,C = map(int,input().split())

	assert(aMin>=1 and aMin<=100), "aMin must be 1 <= aMin <= 100"
	assert(bMin>=1 and bMin<=100), "bMin must be 1 <= bMin <= 100"
	assert(cMin>=1 and cMin<=100), "cMin must be 1 <= cMin <= 100"
	assert(A>=1 and A<=100), "A must be 1 <= A <= 100"
	assert(B>=1 and B<=100), "B must be 1 <= B <= 100"
	assert(C>=1 and C<=100), "C must be 1 <= C <= 100"
	#assert(tMin>=aMin+bMin+cMin and tMin<=300), "tMin must be aMin+bMin+cMin <= tMin <= 300"

	if (A>=aMin and B>=bMin and C>=cMin and (A+B+C)>=tMin):
		print("YES")
	else:
		print("NO")

	T -= 1
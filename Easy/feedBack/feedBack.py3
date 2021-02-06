T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	S = input()
	assert(len(S)>=1 and len(S)<=100000), "S must be length 1 <= |S| <= 10^5"

	for i in range(0,len(S)):
		assert(S[i]=='0' or S[i]=='1'), "S must only have 0 or 1"

	if (("010" in S) or ("101" in S)):
		print("Good")
	else:
		print("Bad")

	T -= 1
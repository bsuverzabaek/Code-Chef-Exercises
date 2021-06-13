T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	s = input()
	assert(len(s)>=1 and len(s)<=100000), "Length of s must be 1 <= |s| <= 10^5"

	c = 0

	for i in range(0,len(s)-1):
		if (s[i]=='<' and s[i+1]=='>'):
			c += 1

	print(c)

	T -= 1
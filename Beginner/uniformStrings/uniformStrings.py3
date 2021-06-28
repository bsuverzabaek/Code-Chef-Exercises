T = int(input())
assert(T>=1 and T<=256), "T must be 1 <= T <= 256"

while (T>0):
	s = input()
	assert(len(s)==8), "Length of s must be 8"

	count = 0

	for i in range(0,7):
		if (s[i]!=s[i+1]):
			count += 1

	if (count<=2):
		print("uniform")
	else:
		print("non-uniform")

	T -= 1
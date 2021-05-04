T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	s = input()
	s2 = input()

	n1 = len(s)
	n2 = len(s2)

	assert(n1>=1 and n1<=50), "Length of string s must be 1 <= |s| <= 50"
	assert(n2>=1 and n2<=50), "Length of string t must be 1 <= |t| <= 50"

	t = 0
	u = 0

	temp1 = []
	temp2 = []

	for i in range(0,n1):
		assert(ord(s[i])>=97 and ord(s[i])<=122), "All characters must be lower case letters"

		if (i>0):
			if (s[i]!=s[i-1]):
				temp1.insert(t,s[i])
				t += 1

	for i in range(0,n2):
		assert(ord(s2[i])>=97 and ord(s2[i])<=122), "All characters must be lower case letters"

		if (i>0):
			if (s2[i]!=s2[i-1]):
				temp2.insert(u,s2[i])
				u += 1

	if (temp1==temp2):
		print("Yes")
	else:
		print("No")

	T -= 1
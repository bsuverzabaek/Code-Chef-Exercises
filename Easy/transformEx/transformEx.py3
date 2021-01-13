while (1):
	t = int(input())

	if (t<=0 or t>100):
		print("t must be 1 <= t < 100")
	else:
		break

while (t>0):
	str = []
	s = input()
	s2 = ""

	for i in range(0,len(s)):
		if (s[i]==")"):
			while (str[-1]!="("):
				s2 += str[-1]
				str.pop()
			str.pop()
		elif (s[i]=="("):
			str.append(s[i])
		elif (s[i].isalpha()):
			s2 += s[i]
		else:
			str.append(s[i])

	print(s2)

	t -= 1			
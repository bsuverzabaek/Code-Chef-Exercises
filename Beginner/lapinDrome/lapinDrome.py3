while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		S = input()

		if (len(S)<2 or len(S)>1000):
			print("String S must have length 2 <= S <= 1000")
		else:
			break

	left = ''
	right = ''

	if (len(S)%2==0):
		left = S[:len(S)//2]
		right = S[len(S)//2:]
	else:
		left = S[:len(S)//2]
		right = S[len(S)//2+1:]

	temp = list(left)
	temp2 = list(right)

	temp.sort()
	temp2.sort()

	if (str(temp)==str(temp2)):
		print("YES")
	else:
		print("NO")

	T -= 1		
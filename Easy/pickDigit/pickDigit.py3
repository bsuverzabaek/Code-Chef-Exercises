T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	S = input()

	letter = {65:'A',66:'B',67:'C',68:'D',69:'E',70:'F',71:'G',72:'H',73:'I',74:'J',
			  75:'K',76:'L',77:'M',78:'N',79:'O',80:'P',81:'Q',82:'R',83:'S',84:'T',
			  85:'U',86:'V',87:'W',88:'X',89:'Y',90:'Z'}

	ans = ""

	count6 = S.count('6')
	count7 = S.count('7')
	count8 = S.count('8')
	count9 = S.count('9')

	for i in range(0,10):
		if (str(i) in S):
			if (count9>0 and i==0):
				ans += (letter[int(str(9)+str(0))])
			
			if (count6>0 and i>=5):
				if (i==6):
					if (count6==1):
						pass
					else:
						ans += (letter[int(str(6)+str(6))])
				else:
					ans += (letter[int(str(6)+str(i))])
			
			if (count7>0):
				if (i==7):
					if (count7==1):
						pass
					else:
						ans += (letter[int(str(7)+str(7))])
				else:
					ans += (letter[int(str(7)+str(i))])
			
			if (count8>0):
				if (i==8):
					if (count8==1):
						pass
					else:
						ans += (letter[int(str(8)+str(8))])
				else:
					ans += (letter[int(str(8)+str(i))])

	ans = sorted(ans)
	ans = "".join(ans)
	print(ans)

	T -= 1
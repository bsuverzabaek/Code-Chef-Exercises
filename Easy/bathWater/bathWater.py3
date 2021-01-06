while (1):
	n = int(input("Input n: "))

	if(n<=0 or n>100000):
		print("n must be 1 <= n <= 10^5")
	else:
		break

while (n>0):
	while (1):
		v1,t1,v2,t2,v3,t3 = map(int, input().split())

		if (v1<=0 or v1>1000000 or v2<=0 or v2>1000000 or v3<=0 or v3>1000000):
			print("Volume must be 1 <= v1,v2,v3 <= 10^6")
		elif(t1<=0 or t1>=t2 or t2<=t1 or t2>1000000):
			print("Temperature must be 1 <= t1 < t2 <= 10^6")
		elif(t3<=0 or t3>1000000):
			print("t3 must be 1 <= t3 <= 10^6")
		else:
			break

	if (v1>=v3*(v1/(v1+v2)) and v2>=v3*(v2/(v1+v2)) and t3==((v1*t1)+(v2*t2))/(v1+v2)):
		print("YES")
	elif((v1==v3 and t1==t3) or (v2==v3 and t2==t3)):
		print("YES")
	else:
		print("NO")

	n -= 1
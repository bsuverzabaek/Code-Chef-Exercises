while (1):
	L = int(input())
	B = int(input())

	if (L<=0 or L>1000 or B<=0 or B>1000):
		print("L and B must be 1 <= L,B <= 1000")
	else:
		break

if ((L*B)>(2*(L+B))):
	print("Area")
	print(L*B)
elif ((2*(L+B))>(L*B)):
	print("Peri")
	print(2*(L+B))
else:
	print("Eq")
	print(L*B)
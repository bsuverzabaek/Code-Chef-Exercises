import math

def area(a,b,c):
	s = (a+b+c)/2
	return math.sqrt(s*(s-a)*(s-b)*(s-c))

T = int(input())
assert(T>=1 and T<=30), "T must be 1 <= T <= 30"

while (T>0):
	wx,wy,wz,xy,xz,yz = map(float,input().split())

	assert(wx<=1000), "The edges must be <=1000"
	assert(wy<=1000), "The edges must be <=1000"
	assert(wz<=1000), "The edges must be <=1000"
	assert(xy<=1000), "The edges must be <=1000"
	assert(xz<=1000), "The edges must be <=1000"
	assert(yz<=1000), "The edges must be <=1000"

	sA = 0
	sA += area(wx,wy,xy)
	sA += area(wy,wz,yz)
	sA += area(xy,xz,yz)
	sA += area(wx,wz,xz)

	wx1 = wx*wx
	wy1 = wy*wy
	wz1 = wz*wz
	xy1 = xy*xy
	xz1 = xz*xz
	yz1 = yz*yz

	tmp1 = wz1+xz1-wx1
	tmp2 = wz1+yz1-wy1
	tmp3 = yz1+xz1-xy1

	vol = math.sqrt(4*(yz1*wz1*xz1)-(yz1*tmp1*tmp1)-(xz1*tmp2*tmp2)-(wz1*tmp3*tmp3)+(tmp1*tmp2*tmp3))/12
	print("{:.4f}".format(((3*vol)/sA)))

	T -= 1
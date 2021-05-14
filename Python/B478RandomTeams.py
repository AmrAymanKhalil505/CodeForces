import operator as op
from functools import reduce
import math

line = input().split(sep=" ")

def ncr(n, r):
    if(n <2):
        return 0
    r = min(r, n-r)
    numer = reduce(op.mul, range(n, n-r, -1), 1)
    denom = reduce(op.mul, range(1, r+1), 1)
    return numer // denom  # or / in Python 2
n = int(line[0])
m = int(line[1])
f = n - m + 1
zmax = ncr(f , 2)
zmin = 0
f = int(math.ceil(n / m))
if( n%m == 0 ):
    zmin = ncr(f, 2) * (m)
else:
    zmin = ncr(f, 2)*(m-1) +  ncr((n-(f*(m-1))), 2)


print(zmin,zmax, sep=" ")




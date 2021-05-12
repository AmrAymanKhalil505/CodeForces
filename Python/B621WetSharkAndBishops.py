import operator as op
from functools import reduce

def ncr(n, r):
    r = min(r, n-r)
    numer = reduce(op.mul, range(n, n-r, -1), 1)
    denom = reduce(op.mul, range(1, r+1), 1)
    return numer // denom  # or / in Python 2
n = int(input())
pos_grid = [0] * 4000
neg_grid = [0] * 4000
for i in range(n):
    line = input().split(sep=" ")
    pos_grid[int(line[0])+int(line[1])]+=1
    neg_grid[int(line[0])-int(line[1])]+=1

c=0
for i in range(len(pos_grid)):
    if(pos_grid[i]>1):
        c += ncr(pos_grid[i],2)
for i in range(len(neg_grid)):
    if(neg_grid[i] > 1):
        c += ncr(neg_grid[i], 2)

print(c)
# print(pos_grid)
# print(neg_grid)
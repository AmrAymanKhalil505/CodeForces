n = int(input())
line = input().split(sep=" ")
firstOne = -1
secondOne = -1
myoutput = 1
for i in range(n):
    if line[i] == "1":
        firstOne = i
        break
if firstOne == -1:
    print(0)
else :
    for i in range(firstOne+1, n ):
        if line[i] == "1":
            myoutput *= (i - firstOne)
            firstOne = i
    print(myoutput)
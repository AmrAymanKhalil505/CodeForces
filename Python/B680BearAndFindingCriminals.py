def solve (n :int, a:int, List: list ) -> int:

    left = True
    right = True
    i = 1
    a=a-1
    c=0
    if List[a] == "1":
        c+=1
    while (left and right):
        if (i + a >= n):
            right = False
            break
        if (a-i <0):
            left = False
            break
        if (List[a+i]== "1") and (List[a-i]=="1"):
            c+=2
        i+=1
    while (left):
        if (a-i <0):
            left = False
            break
        if (List[a-i]=="1"):
            c+=1
        i+=1
    while (right):
        if (i + a >= n):
            right = False
            break
        if (List[a+i]== "1"):
            c+=1
        i+=1
    return c
line = input().split(sep=' ')
n = int(line[0])
a = int(line[1])
line = input().split(sep=' ')
print(solve(n,a,line))


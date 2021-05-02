def solve(n:int , List:list )-> int :
    inf = int(1e9)
    p = [0]*n
    used= [False]*(n+1)
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            # if(List[i][j]> p[i] and List[i][j]> p[j]):
            #     p[i] = p[i][j]
            #     p[j] = p[i][j]
            # if(List[i][j]> p[i] and List[i][j]< p[j]):
            #     p[i] = List[i][j]
            if ( p[i] < List[i][j]):
                p[i] = List[i][j]
            if (p[j] < List[i][j]):
                p[j] = List[i][j]
    for i in range(n):
        for j in range(p[i],n+1):
            if not used[j]:
                # print(j)
                used[j] = True
                p[i] = j
                break

    return p
n = int(input())
List = []
for i in range(n):
    line = input().split()
    List.append([])
    for j in range(n):
        List[i].append(int (line[j]) )
#print(n)
#print(List)
to_print = solve(n,List)
for i in range (n):
    print(to_print[i], end=" ")


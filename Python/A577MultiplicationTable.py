def solve(n, x):
    cnt = 0
    for i in range(1, n+1):
        if (x%i == 0 and x/i <=n):
            # print(i, x / i)
            if(x/i==i ):
                cnt+=1
            else:
                cnt+=1
    return cnt

# l = [[0 for i in range (10)] for j in range(10) ]
#
# for i in range(1, 10):
#     for j in range(1, 10):
#         l[i][j] = i * j
# c = 0
# for i in range(1, 10):
#     for j in range(1, 10):
#         if l[i][j] == 36:
#             c+=1
# print(c)
# for i in range(1, 10):
#     print(l[i])
line = input()
line = line.split(sep=' ')
n = int(line[0])
x = int(line[1])
print(solve(n, x))


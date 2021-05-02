n = int(input())
line = input().split(sep=" ")
nums = []
foundOne = False
for i in range(len(line)):
    if(int(line[i]) == 1):
        foundOne=True
        break
if(foundOne):
    print("-1")
else:
    print("1")
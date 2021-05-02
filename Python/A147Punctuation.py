def solve(s :str)->str:
    ss=""
    word_end = False
    comma_mit =False
    last_Panc= ","
    for i in range(len(s)):
        if(comma_mit ):
            if (s[i] == ' '):
                continue
            else:
                ss="".join((ss,last_Panc," "))
                comma_mit= False
                word_end= False
        if(word_end):
            if (s[i] == ' '):
                 continue
            elif (s[i] in [',', '!', '?', '.']):
                comma_mit = True
                last_Panc = s[i]
            else:
                ss="".join((ss," "))
                comma_mit = False
                word_end = False
        if(not word_end):
            if (s[i] == ' '):
                 word_end = True
            elif(s[i] in [',', '!', '?', '.']):
                comma_mit = True
                last_Panc= s[i]
            else:
                ss="".join((ss, s[i]))

    return ss
s= input()
print(solve(s))
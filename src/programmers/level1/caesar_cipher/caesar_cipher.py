def solution(s, n):
    answer = ''
    for i in range(len(s)):
        if (ord(s[i]) <= 90 and (ord(s[i]) + n) >90) or (ord(s[i]) > 90 and (ord(s[i]) +n>122)):
            answer += chr(ord(s[i])+n-26)
        elif s[i] == ' ':
            answer += s[i]
        else:
            answer += chr(ord(s[i])+n)
    return answer

## 인상 깊은 풀이

# def caesar(s, n):
#     s = list(s)
#     for i in range(len(s)):
#         if s[i].isupper():
#             s[i]=chr((ord(s[i])-ord('A')+ n)%26+ord('A'))
#         elif s[i].islower():
#             s[i]=chr((ord(s[i])-ord('a')+ n)%26+ord('a'))
#
#     return "".join(s)
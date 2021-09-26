def solution(s):
    s = s.split()
    for i in range(len(s)):
        s[i] = s[i][0].upper() + s[i][1:].lower()
    return ' '.join(s)


s1 = "3people unFollowed me"
s2 = "for the last week"

result = solution(s1)
print(result)

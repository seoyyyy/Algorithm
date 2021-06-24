# 0 ~ 3 물, 화, 생, 지 , 4 ~ 5 = 역, 지
arr = [int(input()) for _ in range(6)]
s1 = arr[:4]
s2 = arr[4:]
s1.pop(s1.index(min(s1)))
print(sum(s1)+max(s2))
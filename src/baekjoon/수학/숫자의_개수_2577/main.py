n = 1
for _ in range(3):
    n *= int(input())
s = str(n)
for i in range(0, 10):
    print(s.count(str(i)))